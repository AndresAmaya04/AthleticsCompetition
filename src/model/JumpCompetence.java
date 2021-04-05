package model;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class JumpCompetence extends Competence {

    public static final String RESULT_IDENTIFIER = "Metros";

    private JumpType jumpType;

    public JumpCompetence(LocalTime initHour, LocalTime finishHour, DayOfWeek dayOfWeek, JumpType jumpType) {
        super(initHour, finishHour, dayOfWeek);
        this.jumpType=jumpType;
    }
}
