package model;

public enum Category {
    YUNIOR_YOUTH("pre juvenil"), YOUTH("Juvenil"), SUB_23("Sub 23"), MASTER("Master");

    private String category;

    Category(String category) {
        this.category=category;
    }

    public String getCategory() {
        return category;
    }
}
