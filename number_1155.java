package codeup;
import java.util.Scanner;
public class number_1155 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x%7==0) System.out.println("multiple");
        else System.out.println("not multiple");
    }
}
// 문제
// 7의 배수일 경우 multiple를 출력하고, 7의 배수가 아니면 not multiple을 출력하시오.
