package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Competitor {

    private int dorsal;
    private Competence[] competences;
    private String name;
    private String lastName;
    private LocalTime timeResult;
    private double meterResult;
    private Gender gender;
    private LocalDate dateOfBirth;
    private Category category;

    public Competitor(String name, String lastName, Gender gender, LocalDate dateOfBirth) {
        this.competences= new Competence[3];
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
}
