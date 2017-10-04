package com.blah;

public class Guess {
    public static void main(String args[])
        throws java.io.IOException {
        char ch, answer = '?'; // Declare two char variables 'ch', to be initialized later in the System.in.read
                               // and a literal, 'answer'; Condition will pass
                               // when your input (ch) matches the assigned value to answer.

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it? ");

        ch = (char) System.in.read(); // read a char from the keyboard
        if(ch == answer) System.out.println("Correct! ASCII code for " + ch + " is " + (int)ch);
    }
}
