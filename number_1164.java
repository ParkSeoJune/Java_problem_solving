package codeup;

import java.util.Scanner;
public class number_1164 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length1 = in.nextInt();
        int length2 = in.nextInt();
        int length3 = in.nextInt();
        if (length1 < 171) System.out.println("CRASH");
        else if (length2 < 171) System.out.println("CRASH");
        else if (length3 < 171) System.out.println("CRASH");
        else System.out.println("PASS");
    }
}
