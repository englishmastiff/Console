package com.blah;

import com.sun.javafx.css.converters.BooleanConverter;

public class LogicalOpTable {
    public static void main(String args[]) {
        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;
        int pp = p ? 1 : 0;
        int qq = q ? 1 : 0;
        System.out.print(pp + "\t" + qq + "\t");
        System.out.print((pp & qq) + "\t" + (pp | qq) + "\t");
        System.out.println((pp ^ qq) + "\t" + (!p)); //println carriage returns on the last item

        p = true;
        q = false;
        pp = p ? 1 : 0;
        qq = q ? 1 : 0;
        System.out.print(pp + "\t" + qq + "\t");
        System.out.print((pp & qq) + "\t" + (pp | qq) + "\t");
        System.out.println((pp ^ qq) + "\t" + (!p));

        p = false;
        q = true;
        pp = p ? 1 : 0;
        qq = q ? 1 : 0;
        System.out.print(pp + "\t" + qq + "\t");
        System.out.print((pp & qq) + "\t" + (pp | qq) + "\t");
        System.out.println((pp ^ qq) + "\t" + (!p));

        p = false;
        q = false;
        pp = p ? 1 : 0;
        qq = q ? 1 : 0;
        System.out.print(pp + "\t" + qq + "\t");
        System.out.print((pp & qq) + "\t" + (pp | qq) + "\t");
        System.out.println((pp ^ qq) + "\t" + (!p));
    }
}