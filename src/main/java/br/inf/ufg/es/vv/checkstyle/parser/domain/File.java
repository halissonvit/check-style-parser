package br.inf.ufg.es.vv.checkstyle.parser.domain;

import java.util.List;

public class File {
    private String name;
    private List<Error> errors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }
}
