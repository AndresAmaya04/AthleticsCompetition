package model;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Competence {

    private String nameCompetence;

    public Competence(String nameCompetence) {
        this.nameCompetence=nameCompetence;
    }

    public String getNameCompetence() {
        return nameCompetence;
    }

    public void setNameCompetence(String string){
        this.nameCompetence = string;
    }
}
