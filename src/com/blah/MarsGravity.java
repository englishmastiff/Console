class MarsGravity {
    public static void main(String args[]) {
        double mars, earth;
        int counter;

        counter = 0;
        for (earth = 90; earth < 500; earth++) {
            mars = earth * 0.376;
            System.out.println("If I weigh " + earth + "lbs on Earth, then I weigh " + mars + "lbs on Mars.");

            counter++;
            if (counter == 10)
                System.out.println();
                counter = 0;
        }
    }
}
