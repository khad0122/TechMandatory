package com.company;

public class BeachTrip extends Trip {
    //fields
    public String sandalcolor;
    public int tanningHours;

    //constructer
    public BeachTrip(String co, String ci, String h, int d, int p, String sanC, int tH) {
        super(co, ci, h, d, p);
        sandalcolor = sanC;
        tanningHours = tH;
    }

    //methods
    @Override
    public String toString() {
        return ("BeachTrip" + "\nCountry: " + country + "\nCity: " + city + "\nHotel: "
                + hotel + "\nDuration: " + duration + "\nPrice: " + price
                + "\nSandal color: " + sandalcolor + "\nTanning hours: " + tanningHours);
    }
}