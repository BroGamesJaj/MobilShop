package hu.petrik.mobilshop;

public class Mobil {
    private String nev;
    private Integer mennyiseg;
    private Integer darab_ar;
    private String kategoria;

    public Mobil(String nev, Integer mennyiseg, Integer ar, String kategoria) {
        this.nev = nev;
        this.mennyiseg = mennyiseg;
        this.darab_ar = ar;
        this.kategoria = kategoria;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Integer getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(Integer mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public Integer getAr() {
        return darab_ar;
    }

    public void setAr(Integer ar) {
        this.darab_ar = ar;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
}
