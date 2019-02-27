/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author grace.reinsel
 */
public class Rollercoaster {

    public static void main(String[] args) {
        final int MINIMUM_HEIGHT = 152;
        int riders_height;
        int otherRider;
        // determine 
        Scanner keyboardScanner = new Scanner (System.in) ;
        System.out.println("enter your height ( > or = 152 welcome aboard! , < or = 152 = sorry #notsorry )");
        Scanner inputReader = new Scanner (System.in) ;
        riders_height = keyboardScanner.nextInt();
        otherRider = keyboardScanner.nextInt();
        if (riders_height >= MINIMUM_HEIGHT && otherRider >= MINIMUM_HEIGHT) {
            System.out.println("Great! welcome aboard!");
        } else {
            System.out.println("sorry #notsorry");
        } // if else
    } // cloose main
} // close class

