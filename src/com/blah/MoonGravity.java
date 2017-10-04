class MoonGravity {
    public static void main(String args[]) {
        double moon, earth;
        int counter;
        //double moon = 0.17;//moon is 17% Earth's gravity
        //double my_weight;  //my weight on Earth

        counter = 0;
        for (earth = 90; earth < 500; earth++) {
            moon = earth * 0.17;
            System.out.println("If I weigh " + earth + "lbs on Earth, then I weigh " + moon + "lbs on the Moon.");

            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
