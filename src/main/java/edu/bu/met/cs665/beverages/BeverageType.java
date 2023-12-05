/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/05/2023
 * File Name: BeverageType.java
 * Description: The enum class for beverage type. This ensures that the user will always enter a legal value
 * for the type of beverage, catching type errors at compile time instead of runtime.
 */

package edu.bu.met.cs665.beverages;

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
