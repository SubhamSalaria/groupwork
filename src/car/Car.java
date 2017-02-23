/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Subham,Manthan,mahesh
 */
public class Car {
    
    // instance variables
    private String make;                //instance variable for the make of the car
    private String model;               //instace variable for the model of the car
    private int yearOfProduction;       //instace variable for the year of production of the car
    private Double mileage;             //instace variable for the mileage of the car
    private Double sellingPrice;        //instace variable for the selling price of the car
    private ArrayList <String> properties;

//inialize the instance variables

    /**
     *
     * @param make
     * @param model
     * @param year
     * @param mileage
     * @param sellPrice
     * @param properties
     */
    public Car ( String make, String model, int year, Double mileage, Double sellPrice, ArrayList<String> properties)
    {       
        setMake(make);                      
        setModel(model);     
        setyearOfProduction(year);       
        setMileage(mileage); 
        setsellingPrice(sellPrice); 
        setproperties(properties);

    } 
 
    /*
    
   *Adding getters and setters for the ecah method
    *
    
    */

    /**
     *
     * @param make
     */

    public void setMake(String make)
    {
        this.make = make; 
    } 
    
    /**
     *
     * @param model
     */
    public void setModel(String model)
    {
        this.model = model; 
    } 
    
    /**
     *
     * @param year
     */
    public void setyearOfProduction(int year)
    {
        if(year > 1995 && year < (LocalDate.now().getYear()+1)) 
        { 
            this.yearOfProduction = year; 
        }
        else
            throw new IllegalArgumentException("Enter the vallid year to proceed!"); 
    } 
     
    /**
     *
     * @param mileage
     */
    public void setMileage(Double mileage)
    {
        if(mileage > 0 && mileage < 40) 
        { 
            this.mileage = mileage; 
        }
        else
            throw new IllegalArgumentException("Enter valid digits for mileage to proceed!"); 
    } 
    
    /**
     *
     * @param sellPrice
     */
    public void setsellingPrice(Double sellPrice)
    {
        if(sellPrice > 0) 
        { 
            this.sellingPrice = sellPrice; 
        }
        else
            throw new IllegalArgumentException("Enter valid amount for Selling Price to proceed!"); 
    } 
    
    /**
     *
     * @param features
     */
    public void setproperties(ArrayList<String> properties)
    {
        this.properties = properties;
    } 

    /**
     *
     * @return
     */
    public String getMake() {
        return make; 
    }

    /**
     *
     * @return
     */
    public String getModel() {
        return model; 
    }

    /**
     *
     * @return
     */
    public int getyear() {
        return yearOfProduction; 
    } 

    /**
     *
     * @return
     */
    public Double getMileage() {
        return mileage; 
    }

    /**
     *
     * @return
     */
    public Double getSellPrice() {
        return sellingPrice; 
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getproperties() {
        return properties;
    }
}