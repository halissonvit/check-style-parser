package br.inf.ufg.es.vv.checkstyle.parser;

import br.inf.ufg.es.vv.checkstyle.parser.domain.*;
import br.inf.ufg.es.vv.checkstyle.parser.domain.Error;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Henrique Hirako
 */
public class CheckStyleParser {
    public Relatorio parse(java.io.File checkStyleResultsFile) {
        if (!checkStyleResultsFile.exists())
            return null;

        Relatorio relatorio = new Relatorio();
        SAXBuilder builder = new SAXBuilder();

        try{
            Document document = builder.build(checkStyleResultsFile);
            Element rootNode = document.getRootElement();

            List filesXml = rootNode.getChildren("file");
            List<File> files = new ArrayList<File>();
            for(int i = 0; i < filesXml.size(); i++){
                Element fileNode = (Element) filesXml.get(i);
                String name = fileNode.getAttributeValue("name");

                List errorsXml = fileNode.getChildren("error");
                List<Error> errors = new ArrayList<Error>();
                for(int j = 0; j < errorsXml.size(); j++){
                    Element errorNode = (Element) errorsXml.get(j);
                    String line = errorNode.getAttributeValue("line");
                    String column = errorNode.getAttributeValue("column");
                    String severity = errorNode.getAttributeValue("severity");
                    String message = errorNode.getAttributeValue("message");
                    String source = errorNode.getAttributeValue("source");
                    errors.add(new Error(line,column,severity,message,source));
                }

                files.add(new File(name,errors));
            }
            relatorio.setFiles(files);

        } catch (JDOMException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return relatorio;
    }

}
