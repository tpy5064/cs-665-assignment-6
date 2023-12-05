/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/05/2023
 * File Name: CoffeeMachine.java
 * Description: This class handles the creation of beverages. The conditional statement
 * ensures the created drink is legal.
 */

package edu.bu.met.cs665.coffeeMachine;

import edu.bu.met.cs665.beverages.*;

public class CoffeeMachine {

    private static final int MAX_CONDIMENT_VAL = 3;
    private static final int MIN_CONDIMENT_VAL = 0;

    public Beverage serveBeverage(BeverageType type, int numMilk, int numSugar) {
        if (isInvalidCondimentVal(numMilk) || isInvalidCondimentVal(numSugar)) {
            System.out.println("Error Making " + type +  ": Milk and Sugar counts cannot exceed 3 units "
                    + "and cannot be lower than 0 units!");
            return null;
        }

        return BeverageFactory.createBeverage(type, numMilk, numSugar);
    }

    private boolean isInvalidCondimentVal(int val) {
        /**
         * Checks if the condiment value chosen is invalid.
         * @param val the value of the condiment
         * @return    the boolean value of the logical comparison
         */
        return val < MIN_CONDIMENT_VAL || val > MAX_CONDIMENT_VAL;
    }
}
