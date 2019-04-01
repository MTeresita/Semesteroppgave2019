package org.openjfx.models;

public class Person {
    private String fornavn;
    private String etternavn;
    private String telefonnr;
    private String epost;

    public Person(String fornavn, String etternavn, String telefonnr, String epost){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.epost = epost;
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
}
