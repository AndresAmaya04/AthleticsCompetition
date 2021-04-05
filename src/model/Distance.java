package model;

public enum Distance {
    METERS_100("100 metros"), METERS_200("200 metros"), METERS_400("400 metros"), METERS_100_HURDLES("100 metros vallas"),
    METERS_200_HURDLES("200 metros vallas"), METERS_400_HURDLES("400 metros vallas"), RELAY_RACE("Carrera de relevos");

    private String distance;

    Distance(String distance) {
        this.distance=distance;
    }

    public String getDistance() {
        return distance;
    }
}
