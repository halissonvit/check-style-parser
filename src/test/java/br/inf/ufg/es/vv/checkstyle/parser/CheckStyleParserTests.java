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
    public void testParseDeveRetornarNullSeReceberUmRelatorioInvalido() {
        CheckStyleParser parser = new CheckStyleParser();
        assertNull(parser.parse(new File("caminhoInvalido.xml")));
    }
}
