import java.util.*;
import java.math.*;

public class BigInt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger no1 = s.nextBigInteger();
        BigInteger no2 = s.nextBigInteger();
        BigInteger no = BigInteger.valueOf(20);
        BigInteger add = no1.add(no);
        BigInteger mul = no2.multiply(no);
        System.out.println(add);
        System.out.println(mul);
    }
}
