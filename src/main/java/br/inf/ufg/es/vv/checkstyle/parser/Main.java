package br.inf.ufg.es.vv.checkstyle.parser;

import br.inf.ufg.es.vv.checkstyle.parser.domain.Relatorio;

public class Main {
    public static void main(String[] args) {
        CheckStyleParser parser = new CheckStyleParser();
        Relatorio relatorio = parser.parse(new java.io.File(args[0]));

        //Realizar persistência
    }
}
