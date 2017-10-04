package com.blah;

public class BreakDemo {
    public static void main(String args[]) {
        int num = 400;
        // loop while i-squared is less than the num

        for (int i = 0; i < num; i++) {
            if (i * i >= num) break; // terminate loop if i*i >= 100
            System.out.println(i + " ");
        }
        System.out.println("loop complete");
    }
}
