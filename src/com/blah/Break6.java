/* Where you put a label is important */
class Break6 {
    public static void main(String args[]) {
        int x = 10, y = 0;

        stop1:
        //here, the label precedes the for statement
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println(); //blank line to separate each loop's output
        for (x = 0; x < 5; x++)
            stop2:{ //here, the label precedes the opening
                // '{' of the 'for' statement
                for (y = 0; y < 5; y++) {
                    if (y == 2) break stop2;
                    System.out.println("x and y: " + x + " " + y);
                }
            }
    }
}
