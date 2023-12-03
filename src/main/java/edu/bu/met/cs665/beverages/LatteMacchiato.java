package edu.bu.met.cs665.beverages;

import edu.bu.met.cs665.coffeeMachine.Beverage;

public class LatteMacchiato extends Beverage {

    public LatteMacchiato(int numMilk, int numSugar) {
        super(numMilk, numSugar);
    }
    public String info() {
        return "Made Latte Macchiato with " + getNumMilk() + " units of milk and " + getNumSugar() + " units of sugar.";
    }
}
