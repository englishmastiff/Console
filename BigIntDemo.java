import java.math.BigInteger;

class BigIntDemo {

    public static void main(String[] args) {
        BigInteger bi1, bi2;
        int exponent = 3;

        bi1 = new BigInteger("63360");
        bi2 = bi1.pow(exponent);

        String result = "Result is " + bi1 + "^" +exponent+ " = " + bi2;

        System.out.println(result);
    }
}

//Result is 63360^3 = 254358061056000