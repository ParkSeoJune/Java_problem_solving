package codeup;

import java.math.BigInteger;
import java.util.Scanner;
public class number_1128 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger bigNumber2 = new BigInteger("123456789");
        int int_bigNum = bigNumber2.intValue();
        System.out.println(a.multiply(bigNumber2));
    }
}
// 정수를 입력받아서 123456789를 곱하여 출력하는데 long, double, float을 쓰지 않는 문제이다.

