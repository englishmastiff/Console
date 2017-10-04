class SqrRoot {
    public static void main(String args[]) {
        int count, x;
        x = 1;
        for (count = 2; count < 5; count++) {
            x += count; // x = x + count
            System.out.println(x);
        }


/*        double num = 1, sroot = Math.sqrt(num), rerr = num - (sroot * sroot);
        for(; num > -1000; num -= 5) {
            System.out.println("Square root of " + num + " is " + sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();
        }*/
    }

}
