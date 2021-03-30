package model;

public class Delegation {

    private String name;
    private String placeOfOrigin;
    private int registedRunner;
    private Hotel hotel;

    public Delegation(String name, String placeOfOrigin, int registedRunner, Hotel hotel) {
        this.name = name;
        this.placeOfOrigin = placeOfOrigin;
        this.registedRunner = registedRunner;
        this.hotel = hotel;
    }

    public String getName() {
        return name;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public int getRegistedRunner() {
        return registedRunner;
    }

    public Hotel getHotel() {
        return hotel;
    }
}
