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
public class Vehicle {

    String make;
    String model;
    int engineWeight;
    int engineDimensions;
    String compressionRatio;
    String blockHeadMaterial;
    String typeofHeadBolts;
    int boltsPerCylinder;
    String firingOrder;
    String oilCapacity;
    String typeofoil;
    String peakTorque;
    String engineDisplacement;
    String peakHorsePower;
    String valveTrain;
    int gear;
    String gearPosition = "neutral";
    String clutch;
    int speed;
    int fuelLevel;
    boolean clutchPressed;
    boolean brakePressed;
    boolean acceleratorPressed;
    boolean engineOn = true;
    boolean ableToShift = true;
    final int minFirstGear = 2;
    final int maxFirstGear = 10;
    final int minSecondGear = 15;
    final int maxSecondGear = 25;
    final int minThirdGear = 30;
    final int maxThirdGear = 35;
    final int minFourthGear = 40;
    final int maxFourthGear = 45;
    final int minFifthGear = 50;
    final int maxFifthGear = 65;
    final int minSixthGear = 70;
    final int maxSixthGear = 85;

    public void printPublicStats() {

        System.out.println("hits accelerator " + speed);
        System.out.println("clutch pressed down " + clutchPressed);
        System.out.println("puts key turns engine" + engineOn);

    }

    public boolean canShift() {
        ableToShift = false;
        String nextGear;
        if (speed >= minFirstGear && speed < maxFirstGear) {
         ableToShift = true;
            nextGear = "firstGear";
            } else if (speed >= minSecondGear && speed < maxSecondGear) {
               nextGear = "secondGear";
            } else if (speed >= minSecondGear && speed < maxSecondGear) {
            } // close if statement
            
            System.out.println("Shift to next gear?");
                 if (speed >= minThirdGear && speed < maxThirdGear) {
         ableToShift = true;
          nextGear = "thirdGear";
            } else if (speed >= minFourthGear && speed < maxFourthGear) {
               nextGear = "fourthGear";
            } else if (speed >= minFourthGear && speed < maxFourthGear) {
            } // close if statement                
            
            
            System.out.println("Shift to next gear");
                  if (speed >= minFifthGear && speed < maxFifthGear) {
        ableToShift = true;
          nextGear = "fifthGear";
            } else if (speed >= minSixthGear && speed < maxSixthGear) {
               nextGear = "sixthGear";
            } else if (speed >= minSixthGear && speed < maxSixthGear) {
            } // close if statement
                  
                  
                 
            
            System.out.println("Would you like to down shift?");
                 if (speed >= minSixthGear && speed < maxSixthGear) {
        ableToShift = true;
          nextGear = "SixthGear";
            } else if (speed >= minFifthGear && speed < maxFifthGear) {
               nextGear = "fifthGear";
            } else if (speed >= minFifthGear && speed < maxFifthGear) {
            } // close if statement
            
        return ableToShift;
        
    } // close method
                
   
  } // close canShift 
    




