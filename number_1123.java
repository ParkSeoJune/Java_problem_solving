package codeup;

import java.util.Scanner;
public class number_1123 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.printf("%.3f", 9/5.0*x+32);
    }
}
// 섭씨 온도가 입력되면 화씨 온도로 변환하는 문제
//화씨 온도 = 9 / 5 * 섭씨온도 + 32