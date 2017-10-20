/*
contents:
  arg 0: 10

Number of args: 3
contents:
  arg 0: 1
  arg 1: 2
  arg 2: 3

Number of args: 0
contents:
 */


class VarArgs {
    static void vaTest(int... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("contents: ");

        for (int i = 0; i < v.length; i++)
            System.out.println("  arg " + i + ": " + v[i]);

        System.out.println();
    }

    public static void main(String args[]) {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();

    }
}
