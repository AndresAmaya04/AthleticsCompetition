package model;

public enum Medal {
    GOLD("Oro"), SILVER("Plata"), Bronze("Bronce");

    private String nameMedal;

    Medal(String nameMedal) {
        this.nameMedal=nameMedal;
    }

    public String getNameMedal() {
        return nameMedal;
    }
}
