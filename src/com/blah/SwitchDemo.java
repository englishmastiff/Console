class SwitchDemo {
    public static void main(String args[]) {
        int i = 0, j = 1;
        for (; i < 10; i++) {
            switch (i) { //placing the int i here, makes it the control expression for this switch statement
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                case 4:
                    switch (j) {
                        case 1:
                            System.out.println("This j is part of an inner switch");
                            break;
                        case 2:
                            break;
                    }
                    System.out.println("i is four");
                    break;

                default:
                    System.out.println("i is five or more"); //When i is >5, there are no other cases to match, hence it executes the default statement.
            }
        }
    }
}
