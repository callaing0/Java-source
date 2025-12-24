package ReTestEX;

import java.util.Scanner;

public class ReTestEX01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("소수가 아닙니다.");
            return;
        }

        for (int i = 2; i < num; i++) { 
            if (num % i == 0) {
                System.out.println("소수가 아닙니다.");
                return;
            }
        }

        System.out.println("소수입니다.");
    }
}