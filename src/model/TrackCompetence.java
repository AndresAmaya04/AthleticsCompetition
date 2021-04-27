package model;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class TrackCompetence extends Competence {

    public static final String RESULT_IDENTIFIER = "Tiempo";

    private String distance;

    public TrackCompetence(String distance) {
        super(distance);
    }
}
