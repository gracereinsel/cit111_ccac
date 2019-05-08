/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

/**
 * Client class of our Donut class We make instances of Donut objects and
 * populate their member variables
 *
 * @author grace.reinsel
 */
public class DonutLand {

    public static void main(String[] args) {
        // make (i.e. "instantiate") a Donut
        // and store a reference to that Object
        // in variable called firstDonut
        // of type of Donut
        Donut firstDonut = new Donut();
        firstDonut.flavor = "Choco glaze";
        firstDonut.name = "Maria";
        firstDonut.hole = "Uno holiio duh";
        firstDonut.percRemaining = 100;
        firstDonut.size = "Bigger than yo mini";
        firstDonut.eatDonut(10);
        // firstDonut should have 90 % left
        int remainingDonut = firstDonut.getPercentRemaining();
        System.out.println("Perc remaining of"
                + firstDonut.name + "is" + remainingDonut
                + "%");
        printDonutStats(firstDonut);

        Donut secondDonut = new Donut();
        secondDonut.flavor = "Choco sprinklio";
        secondDonut.name = "Great choice";
        secondDonut.percRemaining = 100;
        secondDonut.eatDonut(33);
        printDonutStats(secondDonut);

    } // closs main

    public static void printDonutStats(Donut d) {
        System.out.println("Perc remaining of "
                + d.name + "is" + d.getPercentRemaining()
                + "%");
    }

} // close class
