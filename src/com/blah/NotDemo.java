//This program demonstrates the NOT operator by displaying a number and its complement in binary.

class NotDemo {
    public static void main(String args[]) {
        byte b = -34;

        for (int t = 128; t > 0; t = t / 2) {
            if ((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }

        System.out.println(); //skip a line

        //reverse all bits
        b = (byte) ~b; //One's complement (unary NOT)

        for (int t = 128; t > 0; t = t / 2) {
            if ((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
/*

Output

1 1 0 1 1 1 1 0
0 0 1 0 0 0 0 1

 */