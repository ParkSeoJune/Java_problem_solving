package codeup;

import java.util.Scanner;
public class number_1122 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.printf("%d %d", x/60, x%60);
    }
}
// 초를 입력받아 분 초 형태로 출력하는 문제