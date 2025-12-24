package com.simple.loop;

public class LoopEx01or {
	public static void main(String[] args) {
		
		//1~10까지 짝수의 합을 구하시오
		//1~10까지 홀수의 합을 구하시오
		int evenSum1 = 0;;
		int evenSum2 = 0;;
		
		for(int i=1; i<=10; i++) {
			if (i % 2 == 0) {
				evenSum1 += i;
				System.out.print(i + ", ");				
			}
		}
		
		System.out.println();
		System.out.println("짝수 합:"+evenSum1);
	
		System.out.println();
		//1~10까지 홀수의 합을 구하시오
		
		for(int i=1; i<=10; i++) {
			if (i % 3 == 0) {
				evenSum2 += i;
				System.out.print(i + ", ");				
			}
		}
		
		System.out.println();
		System.out.println("짝수 합:"+evenSum2);
	}

}
