/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/05/2023
 * File Name: Beverage.java
 * Description: This is the Beverage class, holding a BeverageType, its own values for condiment count.
 */

package edu.bu.met.cs665.beverages;

public class Beverage {

    private int numMilk;
    private int numSugar;
    private BeverageType type;

    public int getNumMilk() {
        return numMilk;
    }

    public int getNumSugar() {
        return numSugar;
    }

    public Beverage(BeverageType type, int numMilk, int numSugar) {
        this.numMilk = numMilk;
        this.numSugar = numSugar;
        this.type = type;
    }

    public String info() {
        /**
         * This method compiles the object's private fields into a string
         * @return the string representation of the Beverage object.
         */
        return "Made "+ this.type.getName() + " with " + getNumMilk() +
                " units of milk and " + getNumSugar() + " units of sugar.";
    }

}
