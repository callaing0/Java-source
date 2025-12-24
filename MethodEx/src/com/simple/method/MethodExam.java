package com.simple.method;

// import java.util.Scanner;

public class MethodExam {
	public static void main(String[] args) {
		//메서드 : 입력 > 처리 > 출력
		//사칙연산 계산기 만들기
		
		//데이터 입력 : 정수 두개
		int num1 = 10;
		int num2 = 20;
		int sum, sub, mul;
		double div;
		
		//kbd = new Scanner(System.in);
		
		
		//데이터 처리 : +,-,*,/
		sum = num1+num2;
		sub = num1-num2;
		mul = num1*num2;
		div = num1/(double)num2;
		
		
		//데이터 출력 : 사칙연산 계산값
		System.out.println("num1 num2 합  차  곱  몫");
		System.out.printf("%3d %3d %4d %2d %2d %6.2f \n",
				         num1, num2, sum, sub, mul, div);
	}

}
