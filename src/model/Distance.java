package model;

public enum Distance {
    METERS_100("100 metros"), METERS_200("200 METROS"), METERS_400("400 metros"), METERS_HURDLES_100("100 metros vallas"),METERS_HURDLES_200("200 metros vallas"), METERS_HURDLES_400("400 metros vallas");

    private String distanceCompetition;

    Distance(String distanceCompetition) {
        this.distanceCompetition=distanceCompetition;
    }

    public String getDistanceCompetition() {
        return distanceCompetition;
    }
}
