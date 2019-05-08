/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

/**
 *"Blueprint" class that models
 * a real-world donut; No main method
 * @author grace.reinsel
 */
public class Donut {
// Memember variables
    // Each instance of a Donut class
    // will receive each of these member variables
    //
    String name;
    int percRemaining;
    String size;
    String flavor;
    String hole;
    
    /**
    **
    *simulates eatingsome percent of this 
    *donut
    *@param percentEaten
    */
    public void eatDonut(int percentEaten) {
        percRemaining = percRemaining - percentEaten;
    }
    
    /*
    ** 
    *Accessor method for reetrieving the value
            * of the member vvariable: percRemaining;
            * @return the percent remaining
    */
    
    
    public int getPercentRemaining () {
   
  
} // close main

} // close class

