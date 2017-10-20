/*
When a method calls itself, new local variables and parameters

Recursive versions of many routines may execute a bit more slowly than their iterative equivalents, because of the added
overhead of the additional method calls. Too many recursive calls to a method could cause a stack overrun. Because storage
for parameters and local variables is on the stack adn each new call creates a new copy of these variables, it is possible
that the stack could be exhausted. If this occurs, the Java runtime system will cause an exception.
 */

class Factorial {

    // This is a recursive function
    int factR(int n) {
        int result;
        if(n==1) return 1;  // stops count at 1
        result = factR(n-1) * n;
        return result;
    }

    // This is an iterative function
    int factI(int n) {
        int t, result;

        result = 1;
        for(t=1;t<=n;t++) result *= t;  // stops count at n
        return result;
    }
}

public class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();

        System.out.println("Factorials using recursive method.");
        System.out.println("Factorial of 3 is " + f.factR(3));
        System.out.println("Factorial of 4 is " + f.factR(4));
        System.out.println("Factorial of 5 is " + f.factR(6));
        System.out.println();

        System.out.println("Factorials using iterative method");
        System.out.println("Factorial of 3 is " + f.factI(3));
        System.out.println("Factorial of 4 is " + f.factI(4));
        System.out.println("Factorial of 5 is " + f.factI(5));
    }
}
