package edu.bu.met.cs665.coffeeMachine;


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
        return "Made "+ this.type.getName() + " with " + getNumMilk() +
                " units of milk and " + getNumSugar() + " units of sugar.";
    }

}
