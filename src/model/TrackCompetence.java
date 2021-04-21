package model;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class TrackCompetence extends Competence {

    public static final String RESULT_IDENTIFIER = "Tiempo";

    private Distance distance;

    public TrackCompetence(LocalTime initHour, LocalTime finishHour, DayOfWeek dayOfWeek, Distance distance) {
        super(initHour, finishHour, dayOfWeek);
        this.distance=distance;
    }

    private void definedCompetence(){
        switch (this.distance){
            case METERS_100:
                this.setNameCompetence(distance.getDistance());
                break;
            case METERS_100_HURDLES:
                this.setNameCompetence(distance.getDistance());
                break;
            case METERS_200:
                this.setNameCompetence(distance.getDistance());
                break;
            case METERS_200_HURDLES:
                this.setNameCompetence(distance.getDistance());
                break;
            case METERS_400:
                this.setNameCompetence(distance.getDistance());
                break;
            case METERS_400_HURDLES:
                this.setNameCompetence(distance.getDistance());
                break;
        }
    }
}
