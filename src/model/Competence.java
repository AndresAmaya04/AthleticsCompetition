package model;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Competence {

    private LocalTime initHour;
    private LocalTime finishHour;
    private DayOfWeek dayOfWeek;
    private String nameCompetence;

    public Competence(LocalTime initHour, LocalTime finishHour, DayOfWeek dayOfWeek) {
        this.initHour=initHour;
        this.finishHour=finishHour;
        this.dayOfWeek=dayOfWeek;
    }

    public LocalTime getInitHour() {
        return initHour;
    }

    public LocalTime getFinishHour() {
        return finishHour;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setNameCompetence(String string){
        this.nameCompetence = string;
    }
}
