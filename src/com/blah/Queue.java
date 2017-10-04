class Queue {
    private char q[]; // this array holds the queue
    private int putloc,  getloc; // the put and get indices

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    // Put a character into the queue
    void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    // Get a character from the queue
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class Qdemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet");
        // put some numbers into bigQ
        for(i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        // retrieve and display elements from bigQ
        System.out.println("Contents of bigQ: ");
        for(i = 0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.println(ch);
        }
        System.out.println("\n");

        System.out.println("USing smallQ to generate errors.");
        for(i=0; i < 5; i++) {
            System.out.println("Attempting to store " + (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        //more errors on smallQ
        System.out.println("Contents of smallQ: ");
        for(i=0; i < 5; i++) {
            ch = smallQ.get();

            if(ch != (char) 0) System.out.println(ch);
        }
    }
}