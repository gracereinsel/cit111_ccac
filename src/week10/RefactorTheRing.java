/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.Random;

/**
 *
 * @author grace.reinsel
 */
public class RefactorTheRing {

    // chop main up and call the new methods as needed
    public static void main(String[] args) {
       viewerswatchTheRing("Katie") ;
       viewerswatchTheRing("Josh") ;
       viewerswatchTheRing("Rachel") ;
       viewerswatchTheRing("Noah") ;
       viewerswatchTheRing("Aiden") ;
       
        String viewer1 = "Katie";
        String viewer2 = "Josh";
        String viewer3 = "Rachel";
        String viewer4 = "Noah";
        String viewer5 = "Aiden";

        System.out.println(viewer1 + " watched the tape; 7 days to live");
        System.out.println(viewer2 + " watched the tape; 7 days to live");
        System.out.println(viewer3 + " watched the tape; 7 days to live");
        System.out.println(viewer4 + " watched the tape; 7 days to live");
        System.out.println(viewer5 + " watched the tape; 7 days to live");
        System.out.println("****************************************");

        Random randomMachine = new Random();
        boolean madeCopy = randomMachine.nextBoolean();

        System.out.print("Did Viewer 1 named " + viewer1 + " make a copy? ");
        System.out.println(madeCopy);

        if (madeCopy) {
            System.out.println(viewer1 + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer1 + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }

        randomMachine = new Random();
        madeCopy = randomMachine.nextBoolean();

        System.out.print("Did Viewer 2 named " + viewer2 + " make a copy? ");
        System.out.println(madeCopy);

        if (madeCopy) {
            System.out.println(viewer2 + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer2 + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }

        randomMachine = new Random();
        madeCopy = randomMachine.nextBoolean();

        System.out.print("Did Viewer 3 named " + viewer3 + " make a copy? ");
        System.out.println(madeCopy);

        if (madeCopy) {
            System.out.println(viewer3 + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer3 + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }

        randomMachine = new Random();
        madeCopy = randomMachine.nextBoolean();

        System.out.print("Did Viewer 4 named " + viewer4 + " make a copy? ");
        System.out.println(madeCopy);

        if (madeCopy) {
            System.out.println(viewer4 + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer4 + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }

        randomMachine = new Random();
        madeCopy = randomMachine.nextBoolean();

        System.out.print("Did Viewer 5 named " + viewer5 + " make a copy? ");
        System.out.println(madeCopy);

        if (madeCopy) {
            System.out.println(viewer5 + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer5 + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }

    } // close main

    public static void watchTheRing(String viewer) {
        int numViewerSawlllowedByRing = 0 ;
        Random randomMachine = new Random();
        boolean madeCopy = randomMachine.nextBoolean();

        System.out.print("Did Viewer 1 named " + viewer1 + " make a copy? ");
        System.out.println(madeCopy);

        if (madeCopy) {
            System.out.println(viewer1 + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer1 + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;

        } // close if else 

        // write and test your new methods here 
    } // close watchTheRing
} // close public class RefactorTheRing
