package edu.bu.met.cs665;


import edu.bu.met.cs665.coffeeMachine.Beverage;
import edu.bu.met.cs665.coffeeMachine.CoffeeMachine;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class TestCoffeeMachine {

    CoffeeMachine coffeeMachine = new CoffeeMachine();
    Beverage beverage;

    @Test
    //Test a valid case
    public void testBeverageValid() {
        beverage = coffeeMachine.serveBeverage("Espresso", 0, 2);
        assertNotNull(beverage);
        assertEquals(0, beverage.getNumMilk());
        assertEquals(2, beverage.getNumSugar());
        System.out.println(beverage.info());
        System.out.println("Test Case Passed");
    }

    @Test
    //Test an invalid case, too much milk
    public void testBeverageExceedMilk() {
        beverage = coffeeMachine.serveBeverage("Americano", 4, 1);
        assertNull(beverage);
        System.out.println("Test Case Passed");
    }

    @Test
    //Test an invalid case, too much sugar
    public void testBeverageExceedSugar() {
        beverage = coffeeMachine.serveBeverage("Americano", 1, 4);
        assertNull(beverage);
        System.out.println("Test Case Passed");
    }

    @Test
    //Test an invalid case, milk value negative
    public void testBeverageNegativeMilk() {
        beverage = coffeeMachine.serveBeverage("Americano", -1, 2);
        assertNull(beverage);
        System.out.println("Test Case Passed");
    }

    @Test
    //Test an invalid case, too much sugar
    public void testBeverageNegativeSugar() {
        beverage = coffeeMachine.serveBeverage("Americano", 1, -4);
        assertNull(beverage);
        System.out.println("Test Case Passed");
    }

    @Test
    //Test invalid drink
    public void testIllegalBeverage() {
        beverage = coffeeMachine.serveBeverage("Pepsi", 0, 0);
        assertNull(beverage);
        System.out.println("Test Case Passed");
    }
}
