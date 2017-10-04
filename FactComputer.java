import java.math.BigInteger;
import java.util.ArrayList;

/*
 * Copyright (c) 2000 David Flanagan.  All rights reserved.
 * This code is from the book Java Examples in a Nutshell, 2nd Edition.
 * It is provided AS-IS, WITHOUT ANY WARRANTY either expressed or implied.
 * You may study, use, and modify it for any non-commercial purpose.
 * You may distribute it non-commercially as long as you retain this notice.
 * For a commercial use license, or to purchase the book (recommended),
 * visit http://www.davidflanagan.com/javaexamples2.
 */

/**
 * This program computes and displays the factorial of a number specified on the
 * command line. It handles possible user input errors with try/catch.
 */
public class FactComputer {
    public static void main(String[] args) {
        // Try to compute a factorial.
        // If something goes wrong, handle it in the catch clause below.
        try {
            int x = Integer.parseInt(args[0]);
            System.out.println(x + "! = " + Factorial4.factorial(x));
        }
        // The user forgot to specify an argument.
        // Thrown if args[0] is undefined.
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You must specify an argument");
            System.out.println("Usage: java FactComputer <number>");
        }
        // The argument is not a number. Thrown by Integer.parseInt().
        catch (NumberFormatException e) {
            System.out.println("The argument you specify must be an integer");
        }
        // The argument is < 0. Thrown by Factorial4.factorial()
        catch (IllegalArgumentException e) {
            // Display the message sent by the factorial() method:
            System.out.println("Bad argument: " + e.getMessage());
        }
    }
}

/**
 * This version of the program uses arbitrary precision integers, so it does not
 * have an upper-bound on the values it can compute. It uses an ArrayList object
 * to cache computed values instead of a fixed-size array. An ArrayList is like
 * an array, but can grow to any size. The factorial() method is declared
 * "synchronized" so that it can be safely used in multi-threaded programs. Look
 * up java.math.BigInteger and java.util.ArrayList while studying this class.
 * Prior to Java 1.2, use Vector instead of ArrayList
 */

class Factorial4 {
    protected static ArrayList table = new ArrayList(); // create cache
    static { // Initialize the first element of the cache with !0 = 1.
        table.add(BigInteger.valueOf(1));
    }

    /** The factorial() method, using BigIntegers cached in a ArrayList */
    public static synchronized BigInteger factorial(int x) {
        if (x < 0)
            throw new IllegalArgumentException("x must be non-negative.");
        for (int size = table.size(); size <= x; size++) {
            BigInteger lastfact = (BigInteger) table.get(size - 1);
            BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(size));
            table.add(nextfact);
        }
        return (BigInteger) table.get(x);
    }

    /**
     * A simple main() method that we can use as a standalone test program for
     * our factorial() method.
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++)
            System.out.println(i + "! = " + factorial(i));
    }
}


