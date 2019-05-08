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
public class Finalproject {
    public static void main(String [] args) {

                
       Vehicle firstvehicle = new Vehicle();
       firstvehicle.make = "F250";
       firstvehicle.model = "6.0 powerstroke diese";
       firstvehicle.engineWeight = 966;
       firstvehicle.compressionRatio = "18.0:1" ;
       firstvehicle.blockHeadMaterial = "cast iron cylinder heads" ;
       firstvehicle.typeofHeadBolts = "M14TTY" ; 
       firstvehicle.boltsPerCylinder = 4;
       firstvehicle.firingOrder = "1, 2, 7, 3, 4, 5, 6, 8" ;
       firstvehicle.oilCapacity = "15 Quarts" ;
       firstvehicle.typeofoil = "15w40 Rotella" ;
       firstvehicle.peakTorque = "570 lbs-ft @ 2,000 RPM" ;
       
       firstvehicle.printPublicStats();
       firstvehicle.fuelLevel = 1/2 ;
       firstvehicle.gearPosition = "neutral";
       firstvehicle.clutchPressed = true;
       firstvehicle.brakePressed = true;
       firstvehicle.engineOn = true;
       firstvehicle.speed = 0;
       firstvehicle.canShift();
       firstvehicle.speed = 2;
       firstvehicle.canShift();
       firstvehicle.speed = 10;
       firstvehicle.canShift();
       firstvehicle.speed = 15;
       firstvehicle.canShift();
       firstvehicle.speed = 25;
       firstvehicle.canShift();
       firstvehicle.speed = 30;
       firstvehicle.canShift();
       firstvehicle.speed = 35;
       firstvehicle.canShift();
       firstvehicle.speed = 40;
       firstvehicle.canShift();
       firstvehicle.speed = 45;
       firstvehicle.canShift();
       firstvehicle.speed = 50;
       firstvehicle.canShift();
       firstvehicle.speed = 65;
       firstvehicle.canShift();
       firstvehicle.speed = 70;
       firstvehicle.canShift();
       firstvehicle.speed = 85;




       
               
      

      
       
               
       
       
    } // close main
    
       
       
       
       
       
 



 
} // close class



