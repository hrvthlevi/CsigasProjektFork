package modell;

public enum SzinKodok {
    RESET("\u001B[0m"),
    PIROS("\u001B[31m"),
    KEK("\u001B[34m"),
    ZOLD("\u001B[32m"),
    SARGA("\u001B[33m");
    
    private final String kod;
    
    SzinKodok(String kod) {
        this.kod = kod;
    }

    public String getKod() {
        return kod;
    }

}
