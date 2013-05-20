package br.inf.ufg.es.vv.checkstyle.parser.domain;

@Entity
public class Error {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id
    
   @Column
    private String line;
    @Column
    private String column;
    @Column
    private String severity;
    @Column
    private String message;
    @Column
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
