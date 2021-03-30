package model;

import java.time.LocalTime;

public class Throw extends Competence{
    private ObjectThrow objectThrow;

    public Throw(LocalTime initiHour, LocalTime finalHour, int amountParticipants) {
        super(initiHour, finalHour, amountParticipants);
    }

    public ObjectThrow getObjectThrow() {
        return objectThrow;
    }
}
