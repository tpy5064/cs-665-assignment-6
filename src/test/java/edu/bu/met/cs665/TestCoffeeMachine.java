package edu.bu.met.cs665;


import edu.bu.met.cs665.beverages.Beverage;
import edu.bu.met.cs665.beverages.BeverageType;
import edu.bu.met.cs665.coffeeMachine.CoffeeMachine;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCoffeeMachine {

    CoffeeMachine coffeeMachine = new CoffeeMachine();
    Beverage beverage;

    @Test
    //Test a valid case
    public void testBeverageValid() {
        beverage = coffeeMachine.serveBeverage(BeverageType.ESPRESSO, 0, 2);
        assertNotNull(beverage);
        assertEquals(0, beverage.getNumMilk());
        assertEquals(2, beverage.getNumSugar());
        System.out.println(beverage.info());
    }

    @Test
    //Test an invalid case, too much milk
    public void testBeverageExceedMilk() {
        beverage = coffeeMachine.serveBeverage(BeverageType.AMERICANO, 4, 1);
        assertNull(beverage);
    }

    @Test
    //Test an invalid case, too much sugar
    public void testBeverageExceedSugar() {
        beverage = coffeeMachine.serveBeverage(BeverageType.AMERICANO, 1, 4);
        assertNull(beverage);
    }

    @Test
    //Test an invalid case, milk value negative
    public void testBeverageNegativeMilk() {
        beverage = coffeeMachine.serveBeverage(BeverageType.AMERICANO, -1, 2);
        assertNull(beverage);
    }

    @Test
    //Test an invalid case, too much sugar
    public void testBeverageNegativeSugar() {
        beverage = coffeeMachine.serveBeverage(BeverageType.AMERICANO, 1, -4);
        assertNull(beverage);
    }

//    This test is no longer necessary as the enumerated types prevents this situation.
//    @Test
//    public void testIllegalBeverage() {
//        beverage = coffeeMachine.serveBeverage("Pepsi", 0, 0);
//        assertNull(beverage);
//    }
}
