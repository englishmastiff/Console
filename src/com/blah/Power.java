package com.blah;

public class Power {
    public static void main(String args[]) {
        long e, result;
        for (int i = 0; i < 100; i++) {
            result = 1;
            e = i;

            while (e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2 to the " + i + " power is " + result);
        }
    }
}
