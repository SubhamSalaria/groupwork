/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.util.ArrayList;

/**
 *
 * @author Subham,Manthan,Mahesh
 */
public class MainClass { 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> properties = new ArrayList<String>(); 
        properties.add("Nitro"); 
        properties.add("Aero space");  
        properties.add("Rear wheel Drive"); 
        
        Car car = new Car("Dodge", "Challenger", 2017, 20.00, 60000.00,properties ); 
        
        System.out.print("Dodge Challneger is created successfully \n"); 
        
        
    } 
   
    
}

    

