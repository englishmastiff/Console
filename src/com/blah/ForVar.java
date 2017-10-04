package com.blah;

public class ForVar {
    public static void main(String args[]) { //main method
        int sum = 0, fact = 1;
        for(int i = 1; i <= 5; i++) { //declare and initialize i inside the for
            sum += i; // i is known throughtout the loop
            fact *= i; // 1 = 1 * 1
            System.out.println(fact + " * " + i + " = " + (fact = fact * i));

        }
        //but i is not known here
        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
    }
}
