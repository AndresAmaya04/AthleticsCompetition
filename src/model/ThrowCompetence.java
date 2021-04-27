package model;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class ThrowCompetence extends Competence{

    public static final String RESULT_IDENTIFIER = "Tiempo";

    private String throwType;

    public ThrowCompetence(String throwType) {
        super(throwType);
    }
}
