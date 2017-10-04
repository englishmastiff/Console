class Vehicle3 {
    int passengers; //number of passengers
    int fuelcap;    //fuel capacity in gallons
    int mpg;        //fuel consumption in miles per gallon
    int range() {
        return mpg * fuelcap;
    }
}

public class AddMethod {
    public static void main(String args[]) {
        Vehicle3 minivan = new Vehicle3();
        Vehicle3 sportscar = new Vehicle3();

        int range1, range2;

        //assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Minivan will carry " + minivan.passengers + ". ");

        minivan.range(); //display range of minivan

        System.out.print("Sportscar can carry " + sportscar.passengers + ". ");
        sportscar.range(); //display range of sportscar
    }
}
