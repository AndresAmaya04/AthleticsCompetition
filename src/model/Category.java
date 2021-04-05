package model;

public enum  Category {
    JUNIOR_YOUTH("Pre juvenil"),YOUTH("Juvenil"), SUB_23("Sub 23"), MASTER("Master");

    private String category;

    Category(String category) {
        this.category=category;
    }

    public String getCategory() {
        return category;
    }
}
