/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_3;

/**
 *
 * @author grace.reinsel
 */
public class FriendsLogicOnly {
    
}/*
 * Copyright (C) 2018 delores
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package week_3;

/**
 * Class to demonstrate implementation of if/else logic in context of an
 * activity that creates a chain of logic to assess friend compatability
 * 
 * @author delores the javabot
 */
public class FriendsLogicOnly {
    
    public static void main(String[] args) {
        // hard-coded response to question 1
        final int RESPONSE_HOCKEY = 1;
        // compatability score: this variable will be adjusted based on
        // the user's response to questions
        int compScore = 0;
        
        System.out.println("Do you enjoy hockey? (0 = no, 1 = yes)");
        
        // TODO: wire up actual user input when logic works
        
        // once we have the response saved, implement our decision logic
        if(RESPONSE_HOCKEY == 1){
            compScore = compScore + 10; 
            System.out.println("Great! How 'bout those Pens?");
        } else {
            System.out.println("...you must like it if you tried!");
        } // end if/else blocks
        
        // lots more questions
        
        // final check of compatibility score
        if(compScore > 5){
            System.out.println("Great, we might be friends!");
        } else {
            System.out.println("Yikes, according to my decision tree, "
                    + "we probably wouldn't make good friends.");
        System.out.println("Do you like waffles? (-5 = no, 100 = yes");
        } // end of if/else blocks
        if (response == 1) {
            compScore = compScore + 20;
            System.out.println("Great! Do you like sausage?");
            System.out.println("how 'bout sausage links or sausage patties?");
             System.out.println(" 500 = sausage links; -500 = sausage patties");
             
        }
    } // close main
} // close class

