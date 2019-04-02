package org.openjfx.models;


public class Arrangement{
    private String name;
    private String guest; //artist eller foredragsholder
    private Date date; //skal opprette en klasse som denne er et objekt av.

    public Arrangement(String name, String guest, Date date){
        this.name = name;
        this.guest = guest;
        this.date = date;
    }

}
