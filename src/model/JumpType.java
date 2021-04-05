package model;

public enum JumpType {
    LONG_JUMP("Salto largo"), TRIPLE_JUMP("Triple salto");

    private String jumpType;

    JumpType(String jumpType) {
        this.jumpType=jumpType;
    }

    public String getJumpType() {
        return jumpType;
    }
}
