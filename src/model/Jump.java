package model;

import java.time.LocalTime;

public class Jump extends Competence{
    private JumpType typeOfJump;

    public Jump(LocalTime initiHour, LocalTime finalHour, int amountParticipants) {
        super(initiHour, finalHour, amountParticipants);
    }

    public JumpType getTypeOfJump() {
        return typeOfJump;
    }
}
