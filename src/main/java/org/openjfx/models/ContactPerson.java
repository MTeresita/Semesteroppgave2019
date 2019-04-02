package org.openjfx.models;

public class ContactPerson extends Person{
    private String company;
    private String information;

    public ContactPerson(String firstName, String lastName, String phoneNr, String email, String company, String information){
        super(firstName, lastName, phoneNr, email);
        this.company = company;
        this.information = information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getInformation() {
        return information;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getCompany(){
        return company;
    }
}
