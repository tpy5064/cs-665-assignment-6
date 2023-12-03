package edu.bu.met.cs665.beverages;

import edu.bu.met.cs665.coffeeMachine.Beverage;

public class Americano extends Beverage {

    public Americano(int numMilk, int numSugar) {
        super(numMilk, numSugar);
    }
    public String info() {
        return "Made Americano with " + getNumMilk() + " units of milk and " + getNumSugar() + " units of sugar.";
    }
}
