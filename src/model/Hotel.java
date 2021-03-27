package model;

public enum Hotel {
    HOTEL_A("Hotel a"), HOTEL_B("Hotel b");

    private String hotel;

    Hotel(String name) {
        hotel = name;
    }

    public String getHotel() {
        return hotel;
    }

    public void test(){

    }
}
