// Overloading Constructors
/*
MyClass is overloaded in four ways, each constructing an object differently.
 */

class OverloadConstr {
    int x;

    OverloadConstr() {
        System.out.println("Inside OverloadConstr().");
        x = 0;
    }

    OverloadConstr(int i) {
        System.out.println("Inside OverloadConstr(int).");
        x = i;
    }

    OverloadConstr(double d) {
        System.out.println("Inside OverloadConstr(double).");
        x = (int) d;
    }
    OverloadConstr(int i, int j) {
        System.out.println("Inside OverloadConstr(int, int).");
        x = i * j;
    }
}


public class OverloadConstrDemo {
    public static void main(String args[]) {
        OverloadConstr t1 = new OverloadConstr();
        OverloadConstr t2 = new OverloadConstr(88);
        OverloadConstr t3 = new OverloadConstr(17.23);
        OverloadConstr t4 =  new OverloadConstr(2,5);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);

    }
}
