package com.blah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What's your name? ");
        String s = br.readLine();
        //System.out.print("Enter Integer:");
        System.out.print("Hello, " + s + "!");
        try {
            br.readLine();
        } catch (Exception e) {
            System.err.println("Goodbye!");
        }
    }
}