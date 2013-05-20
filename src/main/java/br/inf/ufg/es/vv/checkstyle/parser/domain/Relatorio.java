package br.inf.ufg.es.vv.checkstyle.parser.domain;

import java.util.List;

public class Relatorio {
    private String version;
    private List<File> files;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
