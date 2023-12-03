package edu.bu.met.cs665.beverages;

import edu.bu.met.cs665.coffeeMachine.Beverage;

public class Espresso extends Beverage {

    public Espresso(int numMilk, int numSugar) {
        super(numMilk, numSugar);
    }
    public String info() {
        return "Made Espresso with " + getNumMilk() + " units of milk and " + getNumSugar() + " units of sugar.";
    }
}
