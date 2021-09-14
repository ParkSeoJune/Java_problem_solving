package codeup;

import java.util.Scanner;
public class number_1139 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if(x==y)
            if(x==0) System.out.println(0);
            else System.out.println(1);
        else System.out.println(0);
    }
}
