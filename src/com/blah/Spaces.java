class Spaces {
    public static void main(String args[])
            throws java.io.IOException {
        char ch;
        int spaces = 0;
        System.out.println("Enter a period to stop.");
        //Use a do instead of for, because we're not concerned with an upper limit
        // of spaces counted, we just want to count them
        do {
            ch = (char) System.in.read();
            if (ch == ' ') spaces++;
        } while (ch != '.');
        System.out.println("Spaces counted: " + spaces);
    }
}
