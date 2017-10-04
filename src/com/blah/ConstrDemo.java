//A simple constructor
class MyClass { //the superclass
    int x;

    MyClass() {  // this is the constructor for class MyClass
        x = 10;
    }
}

public class ConstrDemo { //the subclass
    public static void main(String args[]) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);
    }
}
