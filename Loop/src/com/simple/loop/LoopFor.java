package com.simple.loop;

public class LoopFor {

	public static void main(String[] args) {
		//For : 정해진 횟수만큼 반복
		for(int i=0; i<10; i++) {
			System.out.println("i :"+i);
		}
		
			System.out.println("프로그램 종료");
		
			System.out.println();
			
		//1,3,4,7,9
		for(int i=1; i<9; i+=2) {
			
			//i = i+1 = i++
			//i = i+2 = i+=2
			System.out.println("i :"+i);
		}
			System.out.println("프로그램 종료");
		
			System.out.println();
		
		//10,15,20,25
		for(int i=10; i<100; i+=5) {
			
			//i = i+1 = i++
			//i = i+2 = i+=2
			System.out.println("i :"+i);
		}
			
			System.out.println("프로그램 종료");
					

	}

}
