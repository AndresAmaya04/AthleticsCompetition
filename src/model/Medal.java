package model;

public enum Medal {
    GOLD("Oro"), SILVER("Plata"), BRONZE("Bronce");

    private String nameMedal;

    Medal(String nameMedal) {
        this.nameMedal=nameMedal;
    }

    public String getNameMedal() {
        return nameMedal;
    }
}
