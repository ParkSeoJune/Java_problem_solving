package codeup;

import java.util.Scanner;
public class number_1126 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.printf("%d + %d = %d\n",x,y,x+y);
        System.out.printf("%d - %d = %d\n",x,y,x-y);
        System.out.printf("%d * %d = %d\n",x,y,x*y);
        System.out.printf("%d / %d = %d\n",x,y,x/y);
        System.out.printf("%d %% %d = %d\n",x,y,x%y);
    }
}
// 2 정수를 입력받아 사칙연산의 결과를 출력하는 문제
