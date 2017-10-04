package com.blah;

public class CharArithDemo {
    public static void main(String args[]) {
        char ch;

        ch = 'X';
        System.out.println("ch contains " + ch);

        ch++;    // increment one unit to letter Y, then...
        System.out.println("ch is now " + ch);

        ch = 90;   /* directly assign the letter Z to ch
                   90 is the ASCII code for letter Z
                   The first 127 characters of Unicode are the same as ASCII
                   http://ascii.cl/
                   */
        System.out.println("ch is now " + ch);
    }
}
