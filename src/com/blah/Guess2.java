class Guess2 {
    public static void main(String args[])
            throws java.io.IOException {

        char ch, answer = '?';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it? ");

        ch = (char) System.in.read();

        if(ch == answer) System.out.println("You're right! ASCII code for " + ch + " is " + (int)ch);
        else System.out.println("Sorry, you're wrong");
    }
}
