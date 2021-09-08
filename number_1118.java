package codeup;

import java.util.Scanner;
public class number_1118 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.printf("%.1f", x*y/2.0);
    }
}
// 밑변과 높이를 입력받아 삼각형의 넓이를 출력하는 문제