class KbIn {
    public static void main(String args[])
            throws java.io.IOException {
        char ch;
        System.out.println("Press a key followed by ENTER: ");
        ch = (char) System.in.read();
        // ch is returned as int for some reason.
        // Cast ch as a char.
        System.out.println("Your key is " + ch);
    }
}
