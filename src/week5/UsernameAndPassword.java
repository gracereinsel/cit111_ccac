/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner ;
/**
 *
 * @author grace.reinsel
 */
public class UsernameAndPassword {

    public static void main(String[] args) {
        // BLAH BLLAH
        final String CORRECT_USERNAME = "javaghost" ;
        final String CORRECT_PASSWORD = "ic0d3";

        String enteredUsername;
        String enteredPassword ;
 
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("enter your username followed by enter: ");
        enteredUsername = userInputScanner.next();

        System.out.println("enter password followed by enter: ");
        enteredPassword = userInputScanner.next();

        if (enteredUsername.equals(CORRECT_USERNAME) && enteredPassword.equals(CORRECT_PASSWORD) ) {
            System.out.println("Authentication Successful! You have logged into nothing!");
        }else {
              System.out.println("Failure to authenticate! This attempt will not be recorded");
              } // end if/else blocks

    } // close main method
} // close class UsernameAndPassword
