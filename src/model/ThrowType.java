package model;

public enum  ThrowType {

    DISK("Disco"), JAVELIN("Javalina"), HAMMER("Martillo");

    private String objectToThrow;

    ThrowType(String objectToThrow) {
        this.objectToThrow=objectToThrow;
    }

    public String getObjectToThrow() {
        return objectToThrow;
    }
}
