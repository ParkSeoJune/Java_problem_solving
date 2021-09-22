package codeup;

import java.util.Scanner;
public class number_1158 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if((x>29&&x<41)||(x>59&&x<71)) System.out.println("win");
        else System.out.println("lose");
    }
}
