class PromoDemo {
    public static void main(String args[]) {
        byte b = 10;
        int i = b * b; // OK, no cast needed

        b = 10;
        b = (byte) (b * b);

        System.out.println("i and b: " + i + " " + b);
    }
}
