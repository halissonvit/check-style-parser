package br.inf.ufg.es.vv.checkstyle.parser;
import static org.junit.Assert.*;

import br.inf.ufg.es.vv.checkstyle.parser.domain.Relatorio;
import org.junit.Test;

import java.io.File;

public class CheckStyleParserTests {
    final File checkStyleResultValido = new File("src/test/resources/checkstyle-results.xml");

    @Test
    public void testParseDeveRetornarUmObjetoRelatorioSeReceberUmRelatorioValido() {
        CheckStyleParser parser = new CheckStyleParser();
        assertTrue(parser.parse(checkStyleResultValido) instanceof Relatorio);
    }

    @Test
    public void testObjetoRelatorioPreenchido(){
        CheckStyleParser parser = new CheckStyleParser();
        assertEquals("A lista de Files deveria conter 1 objeto",1,parser.parse(checkStyleResultValido).getFiles().size());
    }

    @Test
    public void testQuantidadeDeErrorsDentroDeUmFile(){
        CheckStyleParser parser = new CheckStyleParser();
        assertEquals("Deveria haver 22 Errors dentro do primeiro File",22,parser.parse(checkStyleResultValido).getFiles().get(0).getErrors().size());
    }

    @Test
    public void testParseDeveRetornarNullSeReceberUmRelatorioInvalido() {
        CheckStyleParser parser = new CheckStyleParser();
        assertNull(parser.parse(new File("caminhoInvalido.xml")));
    }
}
