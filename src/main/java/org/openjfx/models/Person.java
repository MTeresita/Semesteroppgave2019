package org.openjfx.models;

public class Person {
    private String firstName;
    private String lastName;
    private String phoneNr;
    private String email;

    public Person(String firstName, String lastName, String phoneNr, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNr = phoneNr;
        this.email = email;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setPhoneNr(String phoneNr){
        this.phoneNr = phoneNr;
    }

    public String getPhoneNr(){
        return phoneNr;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }


}
