/*
This is incorrect, because it declares a regular parameter (boolean stopFlag) after the varargs parameter.

int doIt(int a, int b, double c, int ... vals, boolean stopFlag) { // Error!


 */

class VarArgs2 {
    static void vaTest(String msg, int ... v) {
        System.out.println(msg + v.length);
        System.out.println("Contents: ");

        for(int i=0; i<v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);

        System.out.println();
    }

    public static void main(String args[]) {
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1,2,3);
        vaTest("no varargs");
    }
}
