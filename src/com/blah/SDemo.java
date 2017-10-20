/*
At times, you will want to define a class member that will be used independently of any object of that class.
But it is possible to create a member that can be used by itself, without reference to a specific instance.
To create such a member, precede its declaration with the keyword 'static' and without reference to any object.
When a member is declared static, it can be accessed before any objects of its class are created.

The most common example of a static member is main() - main() is declared as static because it must be called by the JVM
when your program begins.

static-declared variables = global variables; all instances of the class share the same static variable

 */
class StaticDemo {
    int x;
    static int y; // a static variable; there is one copy of y for all objects to share
}


class SDemo {
    public static void main(String args[]) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        ob1.x = 10;
        ob2.x = 20;
        System.out.println("Of course, ob1.x and ob2.x " + "are independent.");

        System.out.println("ob1.x " + ob1.x + "\nob2.x " + ob2.x);
        System.out.println();

        System.out.println("The static variable y ia shared.");
        StaticDemo.y = 19;
        System.out.println("Set StaticDemo.y to 19.");

        System.out.println();
    }
}
