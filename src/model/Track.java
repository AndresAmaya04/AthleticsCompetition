package model;

import java.time.LocalTime;

public class Track extends  Competence{
    private Distance distance;
    public Track(LocalTime initiHour, LocalTime finalHour, int amountParticipants) {
        super(initiHour, finalHour, amountParticipants);
    }

    public Distance getDistance() {
        return distance;
    }
}
