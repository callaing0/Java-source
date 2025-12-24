package com.simple.method;

// import java.util.Scanner;

public class MethodExam3 {
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
		sum = hap(num1,num2);
		sub = num1-num2;
		mul = num1*num2;
		div = num1/(double)num2;
		
		
		//데이터 출력 : 사칙연산 계산값
		System.out.println("num1 num2 합  차  곱  몫");
		System.out.printf("%3d %3d %4d %2d %2d %6.2f \n",
				         num1, num2, sum, sub, mul, div);
	}
	
	private static int hap(int num1, int num2) {
		//정수 두개를 더해서 그 결과를 반환
		int sun = n1+n2;
	

		return sum;
		
		
	}

}
