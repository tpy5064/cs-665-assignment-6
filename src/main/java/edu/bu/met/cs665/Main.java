/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/05/2023
 * File Name: Main.java
 * Description: The main class and entry point for the project.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.beverages.Beverage;
import edu.bu.met.cs665.beverages.BeverageType;
import edu.bu.met.cs665.coffeeMachine.CoffeeMachine;
import java.util.ArrayList;

public class Main {
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
