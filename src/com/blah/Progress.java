package com.blah;

public class Progress {
    public static void main(String args[]) {
        int i;
        for(i = 1; i < 10000; i+=i) {
            System.out.print(i + " ");
        }
    }
}
