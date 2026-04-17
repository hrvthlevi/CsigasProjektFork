package modell;

import java.util.Objects;

public class Csiga {

    private static final char UT_SZIMPLA = '-';
    private static final char UT_DUPLA = '=';
    private static final String ABRA_CSIGA_EMOJI = "\ud83d\udc0c";
    private static final String ABRA_KUKAC_JEL = "@";

    public static char getUTJEL_1() {
        return UT_SZIMPLA;
    }

    public static char getUTJEL_2() {
        return UT_DUPLA;
    }

    public static String getABRA_1() {
        return ABRA_CSIGA_EMOJI;
    }

    public static String getABRA_2() {
        return ABRA_KUKAC_JEL;
    }

//    private String szin;
    private String szinKod;
    private String megtettUt;
    private boolean gyorsito;
    private SzinKodok szin;

    public Csiga() {
        this(SzinKodok.PIROS, "", false);
    }

    public Csiga(SzinKodok szin) {
        this(szin, "", false);
    }

    public Csiga(SzinKodok szin, String megtettUt, boolean gyorsito) {
        this.szin = szin;
        this.megtettUt = megtettUt;
        this.gyorsito = gyorsito;
        this.szinKod = szin.getKod();
    }

    public SzinKodok getSzin() {
        return szin;
    }

    public String getSzinKod() {
        return szinKod;
    }

    public String getMegtettUt() {
        return megtettUt;
    }

    public boolean isGyorsito() {
        return gyorsito;
    }

    public void setGyorsito(boolean gyorsito) {
        this.gyorsito = gyorsito;
    }

//    private void setSzinKod() {
//        this.szinKod = this.szin.getKod();
////        switch (szin) {
////            default -> szinKod = RED;
////            case PIROS -> szinKod = RED;
////            case KEK -> szinKod = BLUE;
////            case ZOLD -> szinKod = GREEN;
////        }
//    }
    @Override
    public String toString() {
        return "Csiga{" + "szin=" + szin + ", szinKod=" + szinKod + ", megtettUt=" + megtettUt + ", gyorsito=" + gyorsito + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.szin);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Csiga other = (Csiga) obj;
        return Objects.equals(this.szin, other.szin);
    }

    public void megy() {
        int tav = (int) (Math.random() * 4);
        tav = gyorsito ? tav * 2 : tav;
        tav = gyorsito && tav == 0 ? 1 : tav;
        char jel = gyorsito ? Csiga.UT_DUPLA : Csiga.UT_SZIMPLA;
        for (int i = 0; i < tav; i++) {
            megtettUt += jel;
        }
    }

}
