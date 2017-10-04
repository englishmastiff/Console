//package com.blah;

// Try This 5-3 A class that displays the binary representation of a value.

//superclass
class ShowBitsSC {
    int numbits;

    //constructor
    ShowBitsSC(int n) {
        numbits = n;
    }

    void show(long val) {
        long mask = 1;
        mask <<= numbits-1;

        int spacer = 0;
        for(; mask != 0; mask >>>=1) {
            if((val & mask) != 0 ) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if((spacer % 8) == 0) {
                System.out.println();
                spacer = 0;
            }
        }
        System.out.println();
    }
}

class Showbits {
    public static void main(String args[]) {
        ShowBitsSC b = new ShowBitsSC(8);
        ShowBitsSC i = new ShowBitsSC(32);
        ShowBitsSC li = new ShowBitsSC(64);

        System.out.println("123 in binary: ");
        b.show(123);

        System.out.println("\n87987 in binary: ");
        i.show(87987);

        System.out.println("\n23765768");
        li.show(23765758);

        System.out.println("\nLow order 8 bits of 87987 in binary: ");
        b.show(87987);
    }
}
