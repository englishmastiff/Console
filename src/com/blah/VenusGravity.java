class VenusGravity {
    public static void main(String args[]) {
        double venus, earth;
        int counter;

        counter = 0;
        for(earth = 90; earth < 500; earth++) {
            venus = earth * 0.91;
            System.out.println("If I weigh " + earth + "lbs on Earth, then I weigh " + venus + "lbs on Venus.");

            counter++;
            if(counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
