/*
In this example, ShowBits2 class is not known outside of main(), and any attempt to access it by any method other than main()
will result in an error.

You can create an inner class without a name, an anonymous inner class. An object of an anonymous inner class is instantiated
when the class is declared, using 'new'.


 */
class LocalClassDemo {
    public static void main(String args[]) {

        class ShowBits2 {
            int numbits;


            ShowBits2(int n) {
                numbits = n;
            }

            void show(long val) {
                long mask = 1;
                mask <<= numbits - 1;

                int spacer = 0;
                for (; mask != 0; mask >>>= 1) {
                    if ((val & mask) != 0) System.out.print("1");
                    else System.out.print("0");
                    spacer++;
                    if ((spacer % 8) == 0) {
                        System.out.println();
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }

        for (byte b = 0; b < 10; b++) {
            ShowBits2 byteval = new ShowBits2(8);
            System.out.print(b + " in binary: ");
            byteval.show(b);
        }
    }
}