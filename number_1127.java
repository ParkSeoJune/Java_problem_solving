package codeup;

import java.util.Scanner;
public class number_1127 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double p = 0;
        double a = 0;
        double u = 0;
        for (int i = 0; i<3; i++) {
            double x = in.nextDouble();
            int y = in.nextInt();
            if(i == 0)
                p = math(x, y);
            if(i == 1)
                a = math(x, y);
            if(i == 2)
                u = math(x, y);
        }
        System.out.printf("%.1f", p+a+u);
    }

    public static double math(double n, int k) {
        double d = n;
        int l = k;
        double m = d * l;
        return m;
    }
}
// 두 실수와 정수를 입력받아 곱한 값을 모아 더한 값을 출력하는 문제
