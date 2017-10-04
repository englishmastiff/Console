package com.blah;

public class GalToLitTable {
    public static void main(String args[]) {
        double gallons, liters;
        int counter;

        counter = 0; //counter is initialized to zero
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7584;
            System.out.println(gallons + " gallons is " + liters + " liters.");

            counter++; // every 10th line print a blank line
            if(counter == 10) {
                System.out.println();
                counter = 0; //reset counter back to zero, so it prints another blank line after the next 10
            }
        }
    }
}
