//If you include the package, it will look for Vehicle.java
//You can just omit the package statement and just put the class here
//Error:(5, 8) java: class Vehicle is public, should be declared in a file named Vehicle.java
//package com.blah;

class Vehicle1 {
    int passengers; //number of passengers
    int fuelcap;    //fuel capacity in gallons
    int mpg;        //fuel consumption in miles per gallon

    int range() {
        return mpg * fuelcap;
    }
}

//This class declares an object of type Vehicle.
    public class VehicleDemo {
        public static void main(String args[]) {
            Vehicle1 minivan = new Vehicle1(); //create a Vehicle object called minivan
            int range;

            //assign values to fields in minivan
            minivan.passengers = 7;
            minivan.fuelcap = 16;
            minivan.mpg = 21;

            //compute the range assuming a full tank of gas.
            range = minivan.fuelcap * minivan.mpg;
            System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);
        }
    }
