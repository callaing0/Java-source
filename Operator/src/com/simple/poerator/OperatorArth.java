package com.simple.poerator;

public class OperatorArth {

	public static void main(String[] args) {
		
		//산술연산자
		//어떤 숫자가 쩍수인지 홀수인지 처리
		
		int num = 120;
		
		//int even = num % 2;
		boolean even = 0 == (num % 2);		
		System.out.println("짝수야? :"+even);
		
		
		//어던 숫자가 3의 배수인지 아닌지 확인하기
		boolean num3 = 0 == (num % 3);
		System.out.println("3의 배수? :"+num3);
		
	}

}
