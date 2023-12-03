package edu.bu.met.cs665.beverages;

import edu.bu.met.cs665.coffeeMachine.Beverage;

public class BlackTea extends Beverage {

    public BlackTea(int numMilk, int numSugar) {
        super(numMilk, numSugar);
    }
    public String info() {
        return "Made Black Tea with " + getNumMilk() + " units of milk and " + getNumSugar() + " units of sugar.";
    }
}
