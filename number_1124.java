package codeup;

import java.util.Scanner;
public class number_1124 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int indexOfC = input.indexOf('C');
        int indexOfH = input.indexOf('H');
        System.out.println("x : " +input.substring(indexOfC+1, indexOfH));
        System.out.println("y : " +input.substring(indexOfH+1));
    }
}
