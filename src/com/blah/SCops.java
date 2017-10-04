package com.blah;

class SCops {
    public static void main(String args[]) {
        int n = 10, d = 2;
        //Both conditions are true, but && evaluates only the first condition for truth,
        //and will "short circuit" on the first false it finds.
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
        d = 0; //Now, set d to zero
        /*First condition is false, second would be division by zero, so both are false.
        but && evals only the first and short-circuits there because it's false.
        Because it stops evaluation on the first condition, it terminates and does not
        have the chance to eval (n % d) == 0, nor the println statement*/
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
        //both conditions are false and expression will be evaluated as a whole. Compile will fail
        if(d != 0 & (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
    }
}
