package com.blah;


class Vehicle4 {
    int passengers; //number of passengers
    int fuelcap;    //fuel capacity in gallons
    int mpg;        //fuel consumption in miles per gallon

    int range() {
        return mpg * fuelcap;
    }
}

public class RetMethod {
    public static void main(String args[]) {
        Vehicle4 minivan = new Vehicle4();
        Vehicle4 sportscar = new Vehicle4();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("minivan can carry " + minivan.passengers + " with range of " + range1 + " miles.");
        System.out.println("sportscar can carry " + sportscar.passengers + " with range of " + range2 + " miles.");
    }

}
