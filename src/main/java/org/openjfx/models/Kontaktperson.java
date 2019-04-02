package org.openjfx.models;

public class Kontaktperson extends Person{
    private String virksomhet;
    private String opplysninger;

    public Kontaktperson (String fornavn, String etternavn, String telefonnr, String epost, String virksomhet, String opplysninger){
        super(fornavn, etternavn, telefonnr,epost);
        this.virksomhet = virksomhet;
        this.opplysninger = opplysninger;
    }

    public void setOpplysninger(String opplysninger) {
        this.opplysninger = opplysninger;
    }

    public String getOpplysninger() {
        return opplysninger;
    }

    public void setVirksomhet(String virksomhet){
        this.virksomhet = virksomhet;
    }

    public String getVirksomhet(){
        return virksomhet;
    }
}
