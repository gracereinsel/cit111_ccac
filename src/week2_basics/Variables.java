/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_basics;

/**
 *
 * @author grace.reinsel
 */
public class Variables {
    
    public static void main(String[] args) {
        //declare variables and give them a type (they are all int type)
        int shoes = 12;
        int sneakers = 3;
        int boots = 4;
        int sandals = 1;
        int crocs = 4;
        int totalShoes;
        
        // we can operate on them as before
        totalShoes = sneakers + boots + sandals + crocs;
        
        // and print the value of totalShoes to the console with some text
        System.out.println("Total shoes: " + totalShoes);
        
    } // close main method
} // close class variables
