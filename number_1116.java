package codeup;

import java.util.Scanner;
public class number_1116 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.printf("%d + %d = %d\n", x, y, x+y);
        System.out.printf("%d - %d = %d\n", x, y, x-y);
        System.out.printf("%d * %d = %d\n", x, y, x*y);
        System.out.printf("%d / %d = %d\n", x, y, x/y);
    }
}
