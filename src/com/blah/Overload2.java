/*
Method overloading supports polymorphism because it is one way that Java implements the "one interface, multiple methods"
paradigm. To understand how, consider the following: In languages that do not support method overloading, each method must
be given a unique name. However, frequently you will want to implement essentially the same method for different types
of data.

The value of overloading is that it allows the related methods to be accessed by use of a common name.
 */


class Overload2 {
    void f(byte x) {
        System.out.println("Inside f(byte): " + x);
    }

    void f(int x) {
        System.out.println("Inside f(int): " + x);
    }

    void f(double x) {
        System.out.println("Inside f(double): " + x);
    }

    void f(long x) {
        System.out.println("Inside f(long): " + x);
    }
}

class TypeConv {
    public static void main(String args[]) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;

        long l = 483578932;

        ob.f(i);    // calls ob.f(int)
        ob.f(d);    // calls ob.f(double)

        ob.f(b);    // calls ob.f(byte)

        ob.f(s);    // calls ob.f(int) - type conversion
        ob.f(f);    // calls ob.f(double) - type conversion

        ob.f(l);
    }
}