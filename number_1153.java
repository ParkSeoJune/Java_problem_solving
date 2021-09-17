package codeup;

import java.util.Scanner;
public class number_1153 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a>b) System.out.println(">");
        else if(a == b) System.out.println("=");
        else System.out.println("<");
    }
}

// a가 b보다 크면  > 를 출력,
//
//b가 a보다 크면  < 를 출력,
//
//a와 b가 같으면  = 를 출력한다.
