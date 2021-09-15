package codeup;

import java.util.Scanner;
public class number_1150 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        System.out.println(Math.min(x,(Math.min(y,z))));
    }
}
