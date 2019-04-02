package org.openjfx.models;

public class Ticket {
    private int price;
    private int [] numberOfPlaces;//usikker på denne??

    public Ticket(int price, int[] numberOfPlaces) {
        this.price = price;
        this.numberOfPlaces = numberOfPlaces;
    }

    public int getPrice() {
        return price
                ;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int[] getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(int[] numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }
}
