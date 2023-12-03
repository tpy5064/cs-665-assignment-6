package edu.bu.met.cs665.coffeeMachine;

public abstract class Beverage {

    private int numMilk;
    private int numSugar;
    //Flexible way to implement beverage type, prevents duplicate code of multiple classes of beverages.

    public int getNumMilk() {
        return numMilk;
    }

    public int getNumSugar() {
        return numSugar;
    }

    public Beverage(int numMilk, int numSugar) {
        this.numMilk = numMilk;
        this.numSugar = numSugar;
    }

    public abstract String info();

}
