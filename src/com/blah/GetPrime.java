class GetPrime {
    public static void main(String[] args) {
        int i = 2;
        for (; i <= 1400; i++) {
            int counter = 0;
            for (int n = i; n >= 1; n--) { //start from the current, condition count down to 1, and decrement
                if (i % n == 0) {
                    counter += 1;
                }
            }
            if (counter == 2) { //Print numbers with the specified maximum number of divisors;
                // if it counts no more than two instances of divisibility, it's a prime number
                System.out.print(" " + i);
            }
        }
    }
}