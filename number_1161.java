package codeup;

import java.util.Scanner;
public class number_1161 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if(x%2==0) System.out.print("짝수+");
        else System.out.print("홀수+");
        if(y%2==0) System.out.print("짝수=");
        else System.out.print("홀수=");
        if((x+y)%2==0) System.out.println("짝수");
        else System.out.print("홀수");
    }
}
