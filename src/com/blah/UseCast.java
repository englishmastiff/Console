class UseCast {
    public static void main(String args[]) {
        int i;

        for (i = 0; i <= 7; i++) {
            System.out.println(i + " / 3: " + i / 3); //string is wedged in here to present the problem, followed by the result
            System.out.println(i + " / 3: with fractions: " + (float) i / 3);
            System.out.println();
        }
    }
}
