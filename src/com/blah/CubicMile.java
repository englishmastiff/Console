package com.blah;

import java.math.*;

/*
public class BigIntDemo {

    public static void main(String[] args) {
        BigInteger bi1, bi2;
        int exponent = 3;

        bi1 = new BigInteger("63360");
        bi2 = bi1.pow(exponent);

        String result = "Result is " + bi1 + "^" +exponent+ " = " + bi2;

        System.out.println(result);
    }
}
*/


class CubicMile {
    public static void main(String args[]) {
        long ci;
        long im;
        long cm;
        long count;

        //im = 5280 * 12;
        //ci = im * im * im;
        ci = 254358061056000L;

        count = 0;
        for(cm = 1; cm <= 100; cm++) {
            ci = ci * cm;
            System.out.println("There are " + ci + " cubic inches for every " + cm + " cubic mile.");

            count++;
            if(count == 10) {
                System.out.println();
                count = 0;
            }
        }
        System.out.println("\'");
    }


}
