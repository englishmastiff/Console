/*
Methods declared as static have several restrictions:
• They can directly call only other static methods
• They can directly access only static data.
• They do not have a 'this' reference.

In the following class, the static method valDivDenom is illegal"
class StaticError {
    int denom = 3;  //a normal instance var
    static int val = 1024;  // a static var

    // Error! Can't access a non-static variable from within a static method
    static int valDivDenom() {
    return val/denom;   // won't compile!

 */
class StaticMethod {
    static int val = 1024; // a static variable

    // a static method
    static int valDiv2() {
        return val / 2;
    }
}

class SDemo2 {
    public static  void main(String args[]) {
        System.out.println("val is " + StaticMethod.val);
        System.out.println("StaticMethod.valDiv2(): " + StaticMethod.valDiv2());

        StaticMethod.val=4;
        System.out.println("val is " + StaticMethod.val);
        System.out.println("StaticMethod.valDiv(): " + StaticMethod.valDiv2());
    }
}