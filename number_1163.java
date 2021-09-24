package codeup;

import java.util.Scanner;
public class number_1163 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        if((year+month+day) % 1000 / 100  % 2 == 0) System.out.println("대박");
        else System.out.println("그럭저럭");
    }
}
