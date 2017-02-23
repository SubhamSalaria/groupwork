/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Subham,Manthan,Mahesh
 */
   
public class CarTest {
    Car validCar;
    public CarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
          ArrayList<String> properties = new ArrayList<String>();
        properties.add("nitro");
        
        validCar = new Car("Dodge", "Challenger", 2017, 20.00, 60000.00, properties );
    }
    
    @After
    public void tearDown() {
    }

     /**
     * Test of setMake method, of class Car.
     */
    @Test
    public void testSetMake() {
        System.out.println("setMake");
        String make = "Nissan";
        validCar.setMake(make);
        assertEquals(make, validCar.getMake());
    }

    /**
     * Test of setModel method, of class Car.
     */
    @Test
    public void testSetModel() {
        System.out.println("setModel");
        String model = "Sedan";
        validCar.setModel(model);
        assertEquals(model, validCar.getModel());
    }

    /**
     * Test of setyearOfProduction method, of class Car.
     */
    @Test
    public void testSetyearOfProduction() {
        System.out.println("setYear");
        int year = 2007;
        validCar.setyearOfProduction(year);
        assertEquals(year, validCar.getyear());
    }

    
      /**
     * Test of setYearValid method, of class Car.
     */
    @Test
    public void testSetyearOfProductionInvalid() {
        System.out.println("setYear");
        int year = 2020;
        try
        {
            validCar.setyearOfProduction(year);
            fail("setYear should have thrown an exception");
        }
        catch (IllegalArgumentException e)
        {
             
        }
    }
    
    
    /**
     * Test of setMileage method, of class Car.
     */
    @Test
    public void testSetMileage() {
        System.out.println("setMileage");
        Double mileage = 15.00;
        validCar.setMileage(mileage);
        assertEquals(mileage, validCar.getMileage());
    }

    
        /**
     * Test of setMileageInvalid method, of class Car.
     */
    @Test
    public void testSetMileageInvalid() {
        System.out.println("setMileage");
        Double mileage = -4.00;
        try
        {
            validCar.setMileage(mileage);
            fail("setYear should have thrown an exception");
        }
        catch (IllegalArgumentException e)
        {
             
        }
    }
    
    /**
     * Test of setsellingPrice method, of class Car.
     */
    @Test
    public void testSetsellingPrice() {
        System.out.println("setsellingPrice");
        Double sellPrice = 10000.00;
        validCar.setsellingPrice(sellPrice);
        assertEquals(sellPrice, validCar.getSellPrice());
    }

    /**
     * Test of setFeatures method, of class Car.
     */
    @Test
    public void testSetproperties() {
     System.out.println("setproperties");
        ArrayList<String> properties = new ArrayList<String>();
        properties.add("nitro");
        validCar.setproperties(properties);
        assertEquals(properties, validCar.getproperties());
    }

    /**
     * Test of getMake method, of class Car.
     */
    @Test
    public void testGetMake() {
        System.out.println("getMake");
        String expResult = "Dodge";
        String result = validCar.getMake();
        assertEquals(expResult, result);
    }

    /**
     * Test of getModel method, of class Car.
     */
    @Test
    public void testGetModel() {
       System.out.println("getModel");
        String expResult = "Challenger";
        String result = validCar.getModel();
        assertEquals(expResult, result);
    }

 
}
