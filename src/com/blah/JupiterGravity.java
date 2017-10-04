package com.blah;

public class JupiterGravity {
    public static void main(String args[]) {
        double jupiter, earth;
        int counter;

        counter = 0;
        for(earth = 90; earth < 500; earth++) {
            jupiter = earth * 2.4;
            System.out.println("If I weigh " + earth + "lbs on Earth, then I weigh " + jupiter + "lbs on the Moon.");

            counter++;
            if(counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
