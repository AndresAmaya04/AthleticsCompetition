package model;

public enum ObjectThrow {
    HAMMER("Martillo"), DISK("Disco"), JAVELIN("Jabalina");

    private String objectThrow;

    ObjectThrow(String name) {
        objectThrow = name;
    }

    public String getObjectThrow() {
        return objectThrow;
    }
}
