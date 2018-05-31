/*
Inheritance Basics

Java supports inheritance by allowing one class to incorporate another class into its declaration.
This is done by using the 'extends' keyword. Thus, the subclass adds to (extends) the superclass.

This example illustrates several key features of inheritance.
It creates a superclass TwoDShape, which stores the width

 */

class TwoDShape {
    double width;
    double height;

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}

// subclass of TwoDShape for triangles; calculates the area, with a user-definable description string
class Triangle extends TwoDShape {
    String style;

    double area() {
        return width * height / 2;      // area of a triangle
    }

    void showStyle() {  // method
        System.out.println("Triangle is " + style);
    }
}


class Shapes {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();   // create new objects
        Triangle t2 = new Triangle();

        t1.width = 4.0;     // double
        t1.height = 4.0;
        t1.style = "filled";    //string

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "outlined";

        System.out.println("Info for t1: ");
        t1.showStyle();
        t2.showStyle();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
        System.out.println();

        // use the TwoDShape superclass by itself

        TwoDShape shape = new TwoDShape();

        shape.width = 10;
        shape.height = 20;
        System.out.println("Using the superclass by itself...");
        shape.showDim();    // prints dimensions
    }
}

/*
Superclass TwoDShape defines the attributes of a "generic" two-dimensional shape, such as a square, rectangle,
triangle, etc.

The Triangle class creates a specific type of TwoDShape - a triangle in this case.
The Triangle class includes all of TwoDObject, and adds the field 'style' and the methods 'area()' and 'showStyle
()'.


The Triangle's style is stored in 'style'. This is something like 'warning symbol', 'isosceles', 'rounded', etc. The
area() method computes and returns the area of the triangle, and showStyle() displays the triangle style.

Superclasses are independent of their extending subclasses, and can be used on their own.


TwoDShape - width       -
        \ - height      -  \
          - showDim()   -
            style       -   Triangle
            area()      -  /
            showStyle() -
*/



class Rectangle extends TwoDShape {
    boolean isSquare() {
        if(width == height) {
            System.out.println("Print this line, only if width == height.");
            return true;
        }
        return false;
    }

    double area() {
        return width * height;
    }
}


class Testing {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.width = 14;
        r1.height = 15;

        r2.width = 10;
        r2.height = 10;

        System.out.println("Rectangle r1 is: " + r1.isSquare());
        System.out.println("Rectangle r2 is: " + r2.isSquare());
        r1.showDim();
        r2.showDim();
    }
}
