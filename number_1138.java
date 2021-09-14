package codeup;

import java.util.Scanner;
public class number_1138 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        boolean value = false;
        if(x==1) value = true;
        if(value) x = 0;
        else x = 1;
        System.out.printf("%d", x);
    }
}
