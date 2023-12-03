package edu.bu.met.cs665.coffeeMachine;

import edu.bu.met.cs665.beverages.*;

public class CoffeeMachine {

    public Beverage serveBeverage(String type, int numMilk, int numSugar) {
        if (numMilk > 3 || numMilk < 0 || numSugar > 3 || numSugar < 0) {
            System.out.println("Error Making " + type +  ": Milk and Sugar counts cannot exceed 3 units "
                    + "and cannot be lower than 0 units!");
            return null;
        }

        switch (type) {
        case "Americano":
            return new Americano(numMilk, numSugar);
        case "Espresso":
            return new Espresso(numMilk, numSugar);
        case "Latte Macchiato":
            return new LatteMacchiato(numMilk, numSugar);
        case "Black Tea":
            return new BlackTea(numMilk, numSugar);
        case "Green Tea":
            return new GreenTea(numMilk, numSugar);
        case "Yellow Tea":
            return new YellowTea(numMilk, numSugar);
        default:
            System.out.println("Not legal beverage type!");
            return null;
        }
    }
}
