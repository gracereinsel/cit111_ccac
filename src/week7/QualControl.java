/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Random;

/**
 *
 * @author grace.reinsel
 */
public class QualControl {

    public static void main(String[] args) {
        final int UPPER_END = 1000;
        final int QUALITY_THRESHOLD = 0;
        final int MAX_QUALITY = 0;
        final int UNITS_TO_MAKE = 0;

        int totalFailures = 0;
        int unitQuality = 0;
        int totalUnitsMade = 0;
        // creating random generator OBJECT
        Random randomGenerator = new Random();
        unitQuality = randomGenerator.nextInt(MAX_QUALITY + 1);

        System.out.println(
                "unitQuality: " + unitQuality);
        System.out.println(
                "Unit Quality: " + unitQuality);
        totalUnitsMade = totalUnitsMade + 1;
        if (unitQuality < QUALITY_THRESHOLD) {
                System.out.println("Unit below quality standards!");
                totalFailures = totalFailures + 1;
            } else {
                System.out.println("Unit passes quality test");
            } // close if/else

            System.out.println("Total failures: " + totalFailures +
                    " out of " + totalUnitsMade + " units made");
            System.out.println("***************************");
            
        } // close while
        
        // calculate summary statistics
            
    } // close main
} // close class