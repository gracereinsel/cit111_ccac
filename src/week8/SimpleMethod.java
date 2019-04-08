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
public class SimpleMethod {
    // A method is a named block of code that does
    // a single task (aka function, routine!)

    public static void printStatement() {
        System.ot.println ("Inside main") ;
       String student = "Brody"
        System.out.println("*****inside printStatement****");
        System.out.println("Statement: Where there's a Will theres a Way ");
        System.out.println("************************");
    } // close printStatement

    public static void main(String[] args) {
        // declaring a class member variable
        static String Student = "Brody" ;
        System.out.println("This code is inside a method: main");
        printStatement();

        System.out.println("...back in main");

        printStatement();
    } // close method main

    public static void generateBigNumber() {
        System.out.println("*****INSIDE generateBigNumber*****");
// create a friendly random number genreator
        Random r = new Random();
        // create an object to do math with huge numbers bro
        BigInteger bigInt = new BigInteger(100, r) ;
        // display the randomly generated huge number
        System.out.println(bigInt) ;
// display the randomly generated huge number
        System.out.println(bigInt);
        System.out.println("***************************");
        public static void printBigInteger() {
            String stufent= "Connor" ;
            System.out.println(students) ;
            Random r = new Random () ;
            BigInteger bi = new BigInteger (100, r) ;
        }
        
    } // close generateBigNumber
    
} // close class

