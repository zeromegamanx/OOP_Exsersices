package BigInteger;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("22222222222222222222222222222222222222222222222222");
        BigInteger i2 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        System.out.println(i1.add(i2));
        System.out.println(i1.multiply(i2));
    }
}
