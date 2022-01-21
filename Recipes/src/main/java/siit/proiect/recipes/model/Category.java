package siit.proiect.recipes.model;

public enum Category {
    SOUP("Soup"),MAIN_DISH("Main dish"), SALAD("Salad"), DESSERT("Dessert"), MISCELLANEOUS("Miscellaneous");

    private final String name;

    Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
