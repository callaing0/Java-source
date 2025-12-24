package com.simple.loop;

public class LoopWhile {
	public static void main(String[] args) {
		//1~n까지의 숫자를 더하면서 그 합이 100이 넘을 때까지 반복
		
		int i = 0;
		int sum = 0;
		int count = 0;
		int finalCount =0;
		
		while (sum < 100) {
			sum = sum +i;
			System.out.print("합계 :"+sum);
			System.out.println(" i :"+i);
			i++;
			// count++; //count = count +1; count + =1;
			finalCount = count++;
		}
		
		System.out.println();
		
		//반복횟수 출력
		System.out.println("반복횟수 :"+count);
		System.out.println("최종반복횟수 :"+finalCount);
			
	}

}
