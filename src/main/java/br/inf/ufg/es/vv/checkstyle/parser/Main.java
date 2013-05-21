package br.inf.ufg.es.vv.checkstyle.parser;

import br.inf.ufg.es.vv.checkstyle.parser.domain.File;
import br.inf.ufg.es.vv.checkstyle.parser.domain.Relatorio;
import br.inf.ufg.es.vv.checkstyle.parser.domain.Error;
import br.inf.ufg.es.vv.checkstyle.parser.persistence.GenericDAO;
import br.inf.ufg.es.vv.checkstyle.parser.persistence.util.JpaUtil;
import com.sun.xml.internal.ws.message.saaj.SAAJHeader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CheckStyleParser parser = new CheckStyleParser();
        Relatorio relatorio = parser.parse(new java.io.File(args[0]));
        
        /*
         * Teste para persistencia Decomente para testar.
        Relatorio relatorio = new Relatorio();
        Error erro = new Error("1", "1", "1", "1", "1");
        ArrayList<Error> lista_de_erros = new ArrayList<Error>();
        lista_de_erros.add(erro);
        File file = new File("teste", lista_de_erros);
        ArrayList<File> lista_de_files = new ArrayList<File>();
        lista_de_files.add(file);
        relatorio.setFiles(lista_de_files);
        relatorio.setVersion("Versao de teste");
        */
        
        GenericDAO<Relatorio> dao = new GenericDAO<Relatorio>(JpaUtil.getInstance()
				.getEntityManager(), Relatorio.class);
		dao.salva(relatorio);
        System.out.println("Relatorio salvado com sucesso");
    }
}
