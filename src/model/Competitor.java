package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Competitor {

    private Medal medal;
    private int dorsal;
    private Competence competence;
    private String name;
    private String delegation;
    private String lastName;
    private LocalTime timeResult;
    private double meterResult;
    private Gender gender;
    private LocalDate dateOfBirth;
    private Category category;

    public Competitor(int dorsal, String name, String lastName, String delegation,Gender gender, LocalDate dateOfBirth, Competence competence) {
        this.dorsal = dorsal;
        this.delegation = delegation;
        this.competence = competence;
        this.name=name;
        this.lastName=lastName;
        this.timeResult= null;
        this.meterResult= -1;
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
        determinateCategory();
    }

    private void determinateCategory(){
        int years = Period.between(this.dateOfBirth, LocalDate.now()).getYears();
        if (years >= 12 && years <= 15){
            this.category = Category.JUNIOR_YOUTH;
        }else if(years >= 16 && years <= 18){
            this.category = Category.YOUTH;
        }else if(years >= 19 && years <= 23){
            this.category = Category.YOUTH;
        }else if(years > 23){
            this.category = Category.MASTER;
        }
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getName() {
        return name;
    }

    public Medal getMedal() {
        return medal;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Category getCategory() {
        return category;
    }

    public String getDelegation() {
        return delegation;
    }

    public Object[] getCompetitorInfoForSearch(){
        return new Object[]{this.competence, this.dorsal, this.name, this.lastName ,this.medal.getNameMedal(), this.gender};
    }
}
