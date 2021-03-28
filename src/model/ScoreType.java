package model;

public enum ScoreType {
    TIME("Tiempo"), METERS("Metros");

    private String scoreType;

    ScoreType(String scoreType) {
        this.scoreType=scoreType;
    }

    public String getScoreType() {
        return scoreType;
    }
}
