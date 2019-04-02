package org.openjfx.models;

public class Venue {
    private String name;
    private String typeOfHall;
    private int numberOfSeats;

    public Venue(String name, String typeOfHall, int numberOfSeats){
        this.name = name;
        this.typeOfHall = typeOfHall;
        this.numberOfSeats = numberOfSeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getTypeOfHall() {
        return typeOfHall;
    }

    public void setTypeOfHall(String typeOfHall) {
        this.typeOfHall = typeOfHall;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
