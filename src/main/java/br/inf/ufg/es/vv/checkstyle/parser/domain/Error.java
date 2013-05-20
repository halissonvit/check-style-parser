package br.inf.ufg.es.vv.checkstyle.parser.domain;

public class Error {
    private String line;
    private String column;
    private String severity;
    private String message;
    private String source;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }
}

