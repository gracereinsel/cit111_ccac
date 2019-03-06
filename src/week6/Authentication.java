package week6;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author grace.reinsel
 */
public class Authentication {

    public static void main(String[] args) {
        // BLAH BLLAH
        String CORRECT_USERNAME = "javaghost";
        String CORRECT_PASSWORD = "ic0d3";
        String entered_password;
        final int ATTEMPTS_ALLOWED = 3;
        int ctl = 1;

        Scanner userInputScanner = new Scanner(System.in);
        while (ctl <= ATTEMPTS_ALLOWED) {
            System.out.println("enter password followed by enter: ");
            entered_password = userInputScanner.next();
            boolean areStringEqual = entered_password.equals(CORRECT_PASSWORD);
            System.out.println("Wrong password: try again:");
            if (areStringEqual) {
                System.out.println("Authentication Successful! You have logged into nothing!");
            }
            ctl++;
        } // close while {
        System.out.println("End of program");
    } // close 
} // close main method

