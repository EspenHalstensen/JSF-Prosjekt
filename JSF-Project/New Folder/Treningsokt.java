/**
 *
 * @author Amund
 */
public class Treningsokt {
    private int oktnr;
    private String dato;
    private int varighet;
    private String[] kategori = {"styrke", "kondis", "gaming", "ALL the things!"};
    private String tekst;

    /**
     * @return the oktnr
     */
    public int getOktnr() {
        return oktnr;
    }

    /**
     * @param oktnr the oktnr to set
     */
    public void setOktnr(int oktnr) {
        this.oktnr = oktnr;
    }

    /**
     * @return the dato
     */
    public String getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(String dato) {
        this.dato = dato;
    }

    /**
     * @return the varighet
     */
    public int getVarighet() {
        return varighet;
    }

    /**
     * @param varighet the varighet to set
     */
    public void setVarighet(int varighet) {
        this.varighet = varighet;
    }

    /**
     * @return the kategori
     */
    public String[] getKategori() {
        return kategori;
    }

    /**
     * @return the tekst
     */
    public String getTekst() {
        return tekst;
    }

    /**
     * @param tekst the tekst to set
     */
    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
}
