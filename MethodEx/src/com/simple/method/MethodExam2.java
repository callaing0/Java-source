package com.simple.method;

import java.util.Scanner;

public class MethodExam2 {

    public static void main(String[] args) {
        // 데이터 입력
    	
        Scanner kbd = new Scanner(System.in);

        System.out.print("정수를 입력하세요.");
        int num1 = kbd.nextInt();
        int num2 = kbd.nextInt();
 
        int sum, sub, mul;
        double div;

        // 데이터 처리
        sum = hap(num1, num2);
        sub = cha(num1, num2);
        mul = kub(num1, num2);
        div = nanu(num1,num2);

        // 데이터 출력
        System.out.printf("입력받은 정수 : %d, %d\n", num1, num2);
        System.out.println("덧셈 결과 :"+sum);
        System.out.println("뺄셈 결과 :"+sub);
        System.out.println("곱셈 결과 :"+mul);
        System.out.println("나눗셈 결과 :"+div);
        
        System.out.println("프로그램 종료");
        
    } 

    // 덧셈
    private static int hap(int num1, int num2) {
        return num1 + num2;
    }

    // 뺄셈
    private static int cha(int num1, int num2) {
        return num1 - num2;
    }

    // 곱셈
    private static int kub(int num1, int num2) {
        return num1 * num2;
    }
    
    //나눗셈
    private static double nanu(int num1, int num2) {
        return num1 / (double)num2;
    }
}