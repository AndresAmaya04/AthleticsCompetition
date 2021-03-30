package model;

import java.time.LocalDate;

public class Competitor {
    private String name;
    private String lastName;
    private Gender gender;
    private LocalDate dateOfBirth;
    private Delegation delegation;
    private String id;
    private int dorsal;
    private Competence competences;
    private Category category;
    public ScoreType scoreType;

    public Competitor(String name, String lastName, Gender gender, LocalDate dateOfBirth, Delegation delegation, String id, int dorsal, Competence competences, Category category, ScoreType scoreType) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.delegation = delegation;
        this.id = id;
        this.dorsal = dorsal;
        this.competences = competences;
        this.category = category;
        this.scoreType = scoreType;
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

    public Delegation getDelegation() {
        return delegation;
    }

    public String getId() {
        return id;
    }

    public int getDorsal() {
        return dorsal;
    }

    public Competence getCompetences() {
        return competences;
    }

    public Category getCategory() {
        return category;
    }

    public ScoreType getScoreType() {
        return scoreType;
    }
}
