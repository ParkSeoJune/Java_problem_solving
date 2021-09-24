package codeup;

import java.util.Scanner;
public class number_1165 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        int score = in.nextInt();
        for(int i = 0; i < (90 - time) / 5; i++)
            score += 1;
        if((90 - time) % 5 != 0) score++;
        System.out.println(score);
    }
}
