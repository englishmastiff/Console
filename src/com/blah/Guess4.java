package com.blah;

/**
 * Guess game, 4th version, do-while loop to keep input buffer open until correct answer
 */
public class Guess4 {
    public static void main(String args[])
            throws java.io.IOException {

        char ch, ignore, answer = 'Z'; //declare two chars, one to assign later, the other assigned as the answer to be guessed

        do {
            System.out.println("I'm thinking of a letter between A and Z.");
            System.out.print("Can you guess it? ");

            ch = (char) System.in.read();

            //discard characters from input buffer
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("You're god damn right. ASCII code for " + ch + " is " + (int) ch);
            else {
                System.out.print("Sorry, you're ");
                //a nested if
                if (ch < answer) System.out.println("too low. " + ch + " is ASCII code " + (int) ch);
                else System.out.println("too high. " + ch + " is ASCII code " + (int) ch);
                System.out.println("Try again!");
            }
        } while (answer != ch);
    }
}
