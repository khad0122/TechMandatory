package com.company;

public class Trip {
    // fields
    public String country;
    public String city;
    public String hotel;
    public int duration;
    public int price;

    //constructer
    public Trip(String co, String ci, String h, int d, int p) {
        country = co;
        city = ci;
        hotel = h;
        duration = d;
        price = p;
    }
    //methods
    public String toString() {
        return ("Trip" + "\nCountry: " + country + "\nCity: " + city + "\nHotel: "
                + hotel + "\nDuration: " + duration + "\nPrice: " + price);
    }
}