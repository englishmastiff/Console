package com.blah;

public class InchesToMeters {
    public static void main(String args[]) {
        int inches;
        double meters;
        int counter;

        counter = 0;
        for(inches = 1; inches <= 144; inches++) {
            meters = inches * 0.0254;
            System.out.println(inches + " inch(es) are approximately " + meters + " meters" );

            counter++;
            if(counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
