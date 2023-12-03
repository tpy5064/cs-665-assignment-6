package edu.bu.met.cs665.coffeeMachine;

public enum BeverageType {
    ESPRESSO("Espresso"),
    AMERICANO("Americano"),
    LATTE_MACCHIATO("Latte Macchiato"),
    BLACK_TEA("Black Tea"),
    GREEN_TEA("Green Tea"),
    YELLOW_TEA("Yellow Tea");

    private final String name;

    BeverageType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
