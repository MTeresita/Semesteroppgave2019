package org.openjfx.models;

public class Billett {
    private int pris;
    private int [] antallplasser;

    public Billett(int pris, int[] antallplasser) {
        this.pris = pris;
        this.antallplasser = antallplasser;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int[] getAntallplasser() {
        return antallplasser;
    }

    public void setAntallplasser(int[] antallplasser) {
        this.antallplasser = antallplasser;
    }
}
