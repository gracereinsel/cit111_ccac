/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author grace.reinsel
 */
public class BasicSwitchif {
    public static void main(String[] args) {
        // hard-coded value to test switch functionality
        final int SELECTOR = 2;
        
        if (SELECTOR ==1) {
          System.out.println("First case selected");;
        }
        else if (SELECTOR == 2) {
             System.out.println("Second case selected");
        }
        else if (SELECTOR == 79) {
        System.out.println("Cases can match any int value") ;
        
        } else  {
         System.out.println("Default case");
    }
        // match the value of SELECTOR to a case's value and excute the code
        // in that case until a break; is encountered
        switch(SELECTOR){
            case 1: 
                
            break;
            case 2: 
         
            case 79:
                
                break;
                // any pass through this seitch which doesn't match a case hits here
            default:
               
        } // close switching block
    } // close main
public static void printStatement(){
        System.out.println("**********INSIDE printStatement********");
        System.out.println("Statement: Where There's a Will, There's a Way");
        System.out.println("**********************************************");
    } // close method printSpecialStatement
     
     
      public static void generateBigNumber(){
        System.out.println("12456854546543132894849167545467");
        // create a friendly random number generator
        Random r = new Random();
        // create an object to do math with huge numbers
        BigInteger bigInt = new BigInteger(150, r);
        // display the randomly generated huge number
        System.out.println(bigInt);        
        System.out.println("**********************************************");
    } // close method generateBigNumber
      
} // close class
