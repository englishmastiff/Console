import javax.swing.text.StyleContext;

class Summation {
    int sum;

    //Construct from an int
    Summation(int num) {
        sum = 0;
        for(int i = 1; i <= num ; i++)   // curly braces not needed here
            sum += i;
    }

    //Construct from another object
    Summation(Summation ob) {
        sum = ob.sum;
    }
}

class SumDemo {
    public static void main(String args[]) {
        Summation a1 = new Summation(5);
        Summation a2 = new Summation(a1);

        System.out.println("a1.sum: " + a1.sum);
        System.out.println("a2.sum: " + a2.sum);
    }
}
