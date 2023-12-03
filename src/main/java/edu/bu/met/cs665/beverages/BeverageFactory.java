package edu.bu.met.cs665.beverages;

import edu.bu.met.cs665.coffeeMachine.Beverage;
import edu.bu.met.cs665.coffeeMachine.BeverageType;

public class BeverageFactory {

    public static Beverage createBeverage(BeverageType type, int numMilk, int numSugar) {
        return new Beverage(type, numMilk, numSugar);
    }
}
