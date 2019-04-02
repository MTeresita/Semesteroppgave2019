package org.openjfx.models;

public class Kontaktperson {
    private String fornavn;
    private String etternavn;
    private String telefonnr;
    private String epost;
    private String virksomhet;

    public Kontaktperson(String fornavn, String etternavn, String telefonnr, String epost, String virksomhet){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.epost = epost;
        this.virksomhet = virksomhet;
    }

    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }

    public String getFornavn(){
        return fornavn;
    }

    public void setEtternavn(String etternavn){
        this.etternavn = etternavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public void setTelefonnr(String telefonnr){
        this.telefonnr = telefonnr;
    }

    public String getTelefonnr(){
        return telefonnr;
    }

    public void setEpost(String epost){
        this.epost = epost;
    }

    public String getEpost(){
        return epost;
    }

    public void setVirksomhet(String virksomhet){
        this.virksomhet = virksomhet;
    }

    public String getVirksomhet(){
        return virksomhet;
    }
}
