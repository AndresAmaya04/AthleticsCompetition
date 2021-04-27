package model;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class JumpCompetence extends Competence {

    public static final String RESULT_IDENTIFIER = "Metros";

    private String jumpType;

    public JumpCompetence(String jumpType) {
        super(jumpType);
    }
}
