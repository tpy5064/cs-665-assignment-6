/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/05/2023
 * File Name: BeverageFactory.java
 * Description: This class handles the creation of concrete beverage objects. This class currently does not have
 * extra functionality for the createBeverage() method. This is for future extension of functionality.
 */

package edu.bu.met.cs665.beverages;

public class BeverageFactory {

    public static Beverage createBeverage(BeverageType type, int numMilk, int numSugar) {
        return new Beverage(type, numMilk, numSugar);
    }
}
