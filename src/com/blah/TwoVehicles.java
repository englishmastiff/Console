class Vehicle2 {
    int passengers; //number of passengers
    int fuelcap;    //fuel capacity in gallons
    int mpg;        //fuel consumption in miles per gallon


    /*void range() {
        System.out.println("Range is " + fuelcap * mpg);

    }*/

    int range() {
        return mpg * fuelcap;
    }
}

public class TwoVehicles {
    public static void main(String args[]) {
        Vehicle2 minivan = new Vehicle2();
        Vehicle2 sportscar = new Vehicle2();

        int range1, range2;

        //assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        //compute the ranges assuming a full tank of gas
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1 + " miles.");
        System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2 + " miles.");

        sportscar.range();
    }
}
