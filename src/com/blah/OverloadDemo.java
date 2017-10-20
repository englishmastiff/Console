/* Method overloading
Two or more methods within the same class can share the same name, as long as their parameter declarations are different.
When this is the case, methods are said to be overloaded, and the process is referred to as method overloading. Method
overloading is one of the ways in which Java implements polymorphism.

Simply declare different versions of it. With one important restriction:
The type and/or number of the parameters of each overloaded method must differ.

It is not sufficient for two methods to differ only in their return types. Return types do not provide sufficient information
in all cases for Java to decide which method to use.

 */

class Overload {
    void ovlDemo() {
        System.out.println("No parameters");
    }

    void ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    }

    int ovlDemo(int a, int b) {
        System.out.println("Two parameters" + a + " " + b);
        return a + b;
    }

    double ovlDemo(double a, double b) {
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }
}

class OverloadDemo {
    public static void main(String args[]) {
        Overload ob = new Overload();
        int resI;
        double resD;

        // call all versions of ovlDemo()
        ob.ovlDemo();

        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.ovlDemo(4,6) : " + resI);

        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + resD);

    }
}
