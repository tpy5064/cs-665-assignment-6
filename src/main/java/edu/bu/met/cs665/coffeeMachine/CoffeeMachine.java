package edu.bu.met.cs665.coffeeMachine;

import edu.bu.met.cs665.beverages.*;

public class CoffeeMachine {

    private static final int MAX_CONDIMENT_VAL = 3;
    private static final int MIN_CONDIMENT_VAL = 0;

    public Beverage serveBeverage(BeverageType type, int numMilk, int numSugar) {
        if (!isValidCondimentVal(numMilk) || !isValidCondimentVal(numSugar)) {
            System.out.println("Error Making " + type +  ": Milk and Sugar counts cannot exceed 3 units "
                    + "and cannot be lower than 0 units!");
            return null;
        }

        return BeverageFactory.createBeverage(type, numMilk, numSugar);
    }

    private boolean isValidCondimentVal(int val) {
        return val >= MIN_CONDIMENT_VAL && val <= MAX_CONDIMENT_VAL;
    }
}
