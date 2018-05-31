// Use accessor method to set and get private members

class TwoDShape4 {
    private double width;
    private double height;


    TwoDShape4(double w, double h) {
        width = w;
        height = h;
    }

    // Accessor methods
    double getWidth() { return  width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}

// subclass of TwoDShape for triangles; calculates the area, with a user-definable description string
class Triangle4 extends TwoDShape4 {
    public String style;

    Triangle4(String s, double w, double h) {
        super(w, h);
        style = s;

    }


    double area() {
        return getWidth() * getHeight() / 2;      // use accessor methods provided by superclass
    }

    void showStyle() {  // method
        System.out.println("Triangle is " + style);
    }
}


class Shapes4 {
    public static void main(String args[]) {
        Triangle4 t1 = new Triangle4("s", 1,2);   // now, you need to provide arguments
        Triangle4 t2 = new Triangle4("w", 3,4);

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "filled";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
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
    }
}