class Backwards {
    String str;

    Backwards(String s) {
        str = s;
    }

    void bckwd(int index) {
        if(index != str.length()-1)     // a countdown. while the 33 characters, n, are not equals to n-1,
            bckwd(index+1);     // increment the index count

        //System.out.print(index + " ");
        System.out.print(str.charAt(index));
    }
}

class BackwardsDemo {
    public static void main(String args[]) {
        Backwards s = new Backwards("This is a test, written backwards.");

        s.bckwd(0);     // Index '0' is the first character in this message string. In this example it is the 'T' in 'This'
                              // This call places the test string message 's' into 'void bckwd'. That method will write it backwards.
    }
}
