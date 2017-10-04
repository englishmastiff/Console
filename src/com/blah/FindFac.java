package com.blah;

public class FindFac {
    /* Use nested loops to find factors of numbers between 2 and 100. */
    public static void main(String args[]) {
        for(long i = 2; i <= 1000; i++) {
            System.out.println("Factors of " + i + ": ");
            for(long j = 2; j < i; j++) {
                if((i % j) == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
