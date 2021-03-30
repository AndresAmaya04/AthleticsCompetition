package model;

import java.time.LocalTime;

public class Competence {
    private LocalTime initiHour;
    private LocalTime finalHour;
    private int amountParticipants;

    public Competence(LocalTime initiHour, LocalTime finalHour, int amountParticipants) {
        this.initiHour = initiHour;
        this.finalHour = finalHour;
        this.amountParticipants = amountParticipants;
    }

    public LocalTime getInitiHour() {
        return initiHour;
    }

    public LocalTime getFinalHour() {
        return finalHour;
    }

    public int getAmountParticipants() {
        return amountParticipants;
    }
}
