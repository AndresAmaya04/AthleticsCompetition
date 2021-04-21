package model;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class ThrowCompetence extends Competence{

    public static final String RESULT_IDENTIFIER = "Tiempo";

    private ThrowType throwType;

    public ThrowCompetence(LocalTime initHour, LocalTime finishHour, DayOfWeek dayOfWeek, ThrowType throwType) {
        super(initHour, finishHour, dayOfWeek);
        this.throwType=throwType;
        definedCompetence();
    }

    private void definedCompetence(){
        switch (this.throwType){
            case DISK:
                this.setNameCompetence(throwType.getObjectToThrow());
                break;
            case HAMMER:
                this.setNameCompetence(throwType.getObjectToThrow());
                break;
            case JAVELIN:
                this.setNameCompetence(throwType.getObjectToThrow());
                break;
        }
    }
}
