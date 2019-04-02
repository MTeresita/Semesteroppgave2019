package org.openjfx.models;

public class Lokale {
    private String navn;
    private String typeSal;
    private int antallPlasser;

    public Lokale(String navn, String typeSal, int antallPlasser){
        this.navn = navn;
        this.typeSal = typeSal;
        this.antallPlasser = antallPlasser;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn){
        this.navn = navn;
    }

    public String getTypeSal() {
        return typeSal;
    }

    public void setTypeSal(String typeSal) {
        this.typeSal = typeSal;
    }

    public int getAntallPlasser() {
        return antallPlasser;
    }

    public void setAntallPlasser(int antallPlasser) {
        this.antallPlasser = antallPlasser;
    }
}
