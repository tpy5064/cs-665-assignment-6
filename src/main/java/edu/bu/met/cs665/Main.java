/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.coffeeMachine.Beverage;
import edu.bu.met.cs665.coffeeMachine.BeverageType;
import edu.bu.met.cs665.coffeeMachine.CoffeeMachine;
import java.util.ArrayList;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    CoffeeMachine coffeeMachine = new CoffeeMachine();

    //List of beverages to make
    ArrayList<Beverage> beverages = new ArrayList<>();

    beverages.add(coffeeMachine.serveBeverage(BeverageType.ESPRESSO, 0, 0));
    beverages.add(coffeeMachine.serveBeverage(BeverageType.AMERICANO, 1, 1));
    beverages.add(coffeeMachine.serveBeverage(BeverageType.LATTE_MACCHIATO, 3, 3));

    for (Beverage b : beverages) {
      if (b != null) {
        System.out.println(b.info());
      } else {
        System.err.println("Invalid beverage!");
      }
    }




  }

}
