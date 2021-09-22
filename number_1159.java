package codeup;

import java.util.Scanner;
public class number_1159 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if((x>49&&x<71)||x%6==0) System.out.println("win");
        else System.out.println("lose");
    }
}
