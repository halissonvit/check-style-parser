package br.inf.ufg.es.vv.checkstyle.parser;

import br.inf.ufg.es.vv.checkstyle.parser.domain.Relatorio;

import java.io.File;

public class CheckStyleParser {
    public Relatorio parse(File checkStyleResultsFile) {
        if (!checkStyleResultsFile.exists())
            return null;

        Relatorio relatorio = new Relatorio();

        return relatorio;
    }
}
