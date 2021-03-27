package model;

public enum JumpType {
    LONG_JUMP("Salto largo"), TRIPE_JUMP("Salto triple");

    private String jumpType;

    JumpType(String name) {
        jumpType = name;
    }

    public String getJumpType() {
        return jumpType;
    }
}
