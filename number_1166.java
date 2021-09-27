package codeup;

import java.util.Scanner;
public class number_1166 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x%4==0 && x%100 !=0) System.out.println("yes");
        else if(x%400==0) System.out.println("yes");
        else System.out.println("no");
    }
}

// 1. 해(year)가 4의 배수이면서 100의 배수가 아니면 윤년.
//
//
//2. 400의 배수이면 윤년.