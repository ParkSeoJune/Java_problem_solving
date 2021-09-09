package codeup;

import java.util.Scanner;
public class number_1120 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        System.out.printf("%.2f", (x+y+z)/3.0);
    }
}
// 세 수를 입력받아 평균을 구해 소수 둘쨰자리까지 구하는 문제
