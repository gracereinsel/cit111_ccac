/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_3;

import java.util.Scanner;

/**
 *
 * @author grace.reinsel
 */
public class If {
    public static void main(String [] args) {
        Scanner inputReader = new Scanner(System.in);
    int i = inputReader . nextInt();;
    int c = inputReader . nextInt();;
    boolean check = i > c;
    if (check) {
        System.out.println("True: " + i + " is greater than " + c);
        
        System.out.println("False: " + i + " is NOT less than " + c);
    } // close if
} // close main method
} // close class If

