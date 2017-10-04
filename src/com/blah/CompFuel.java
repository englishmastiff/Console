//package com.blah;

// Add a parameterized method that computes the fuel required for a given distance.

class Vehicle6 {
    int passengers; //number of passengers
    int fuelcap;    //fuel capacity in gallons
    int mpg;        //fuel consumption in miles per gallon

    //Return the range
    int range() {
        return mpg * fuelcap;
    }

    // Compute fuel neeed for a given distance.
    double fuelneeded(int miles) {
        return (double) miles /mpg;
    }
}
// End of superclass, begin subclass

class CompFuel {
    public static void main(String args[]) {
        Vehicle6 minivan = new Vehicle6();
        Vehicle6 sportscar = new Vehicle6();
        double gallons;
        int dist = 252;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("To go" + dist + " miles minivans needs " + gallons + " gallons of fuel.");

        gallons = sportscar.fuelneeded(dist);
        System.out.println("To go" + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
    }
}