package com.blah;

public class Guess3 {
    public static void main(String args[])
            throws java.io.IOException {

        char ch, answer = 'Z'; //declare two chars, one to assign later, the other assigned as the answer to be guessed

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it? ");

        ch = (char) System.in.read();

        if(ch == answer) System.out.println("You're god damn right. ASCII code for " + ch + " is " + (int)ch);
        else {
            System.out.print("Sorry, you're ");
            //a nested if
            if(ch < answer) System.out.println("too low. " + ch + " is ASCII code " + (int)ch);
            else System.out.println("too high. " + ch + " is ASCII code " + (int)ch);
        }
    }
}
