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
}
