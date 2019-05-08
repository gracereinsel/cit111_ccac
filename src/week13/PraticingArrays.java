/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;

/**
 *
 * @author grace.reinsel
 */
public class PraticingArrays {

    /**
     * * Creates and loads up a String array
     *
     * @param args not used
     */
    public static void main(String[] args) {
        // create an array object that stores only Strings
        // and store a reference to that array in the variable books
        String[] books = new String[5];

        books[0] = "Perl Cookbook";
        books[1] = "PHP Cookbook";
        books[2] = "Python in a Nutshell";
        books[3] = "Javascript: The Definitive Guide";
        books[4] = "Java in a Nutshell";

        String retrieveBook = books[2];
    } // close main
    
        /**
         * Prints the contents of a String array of size 5, indexed from 0 to 4
         *
         * @param arrayInsideMethod an array of String objects with 5 bins
         */
    public static void printArrayContents(String[] arrayInsideMethod) {
        System.out.println("* * * * * Extract array value and store it * * * * *");
// Extract contents of each arracy bin, then print it to the console
        String extractedArrayValue = arrayInsideMethod[0];
        System.out.println("Book at array at index 0: " + extractedArrayValue);
// do this proccess for each bin of the array
        extractedArrayValue = arrayInsideMethod[1];
        System.out.println("Book at array index 1: " + extractedArrayValue);
        extractedArrayValue = arrayInsideMethod[2];
        System.out.println("Book at array index 2: " + extractedArrayValue);
        extractedArrayValue = arrayInsideMethod[3];
        System.out.println("Book at array index 3: " + extractedArrayValue);
        extractedArrayValue = arrayInsideMethod[4];
        System.out.println("Book at array index 4: " + extractedArrayValue);
        System.out.println("");
        System.out.println("**** Extract from array inside println() ****");
// since the array stores String values, we can extract the value of 
// each array bin directly inside our call to the print() method
        System.out.println("Book at array index 0: " + arrayInsideMethod[0]);
        System.out.println("Book at array index 1: " + arrayInsideMethod[1]);
        System.out.println("Book at array index 2: " + arrayInsideMethod[2]);
        System.out.println("Book at array index 3: " + arrayInsideMethod[3]);
        System.out.println("Book at array index 4: " + arrayInsideMethod[4]);
 } // close main
    
    // a method that takes in a String[] and allows user to populate    
public static void userInteraction(String[] paramarray) {
   
        // display size of array to user
        
        //ask user which bin they want to access
        
        // make a scanner object 
        
        // read in a n int with scan.nextInt()
        
        // modifiy user input to work with 0-indexed arrays (subtract 1)
        
        // look up value in array
        
        // display to user
        
        
        
        
    }
    }
