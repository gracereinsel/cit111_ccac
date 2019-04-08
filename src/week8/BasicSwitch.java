/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author grace.reinsel
 */
public class BasicSwitch {
    public static void main(String[] args) {
        // hard-coded value to test switch functionality
        final int SELECTOR = 23;
        
        // match the value of SELECTOR to a case's value and excute the code
        // in that case until a break; is encountered
        switch(SELECTOR){
            case 1: 
                System.out.println("First case selected");
            break;
            case 2: 
                System.out.println("Second case selected");
            case 79:
                System.out.println("Cases can match any int value") ;
                break;
                // any pass through this seitch which doesn't match a case hits here
            default:
                System.out.println("Default case");
        } // close switching block
    } // close main
} // close class
