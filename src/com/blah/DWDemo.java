package com.blah;

public class DWDemo {
    public static void main(String args[])
        throws java.io.IOException {

        char ch;

        do {
            System.out.println("PRess a key followed by ENTER: ");
            ch = (char) System.in.read();
        }
        while(ch != 'q');

    }
}