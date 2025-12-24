package com.simple.loop;

import java.util.Scanner;

public class LoopDoWhile {
	public static void main(String[] args) {
		//점수를 입력받아 총점과 평균 계산
		//입력받은 점수의 숫자를 카운트하여 평균 계산
		
		int quit =0;
		int jumsu =0; //점수
		int tot =0; //총점
		double avg =0; //평균
		int count =0; //카운트 초기화
		
		
		Scanner kbd = new Scanner(System.in);
		
		do {
			do {
				System.out.println("점수 입력 :");
				jumsu=kbd.nextInt(); //점수입력
				
			} 
			
			//점수 입력 받기
			while (jumsu < 0 || jumsu > 100);
			
			tot += + jumsu; //tot = tot + jumsu;
			count++; //점수 카운트
			
			System.out.println("점수:" +count+":"+jumsu);
			System.out.println("프로그램 종료 99:");
			quit = kbd.nextInt();

		} while (quit !=99);
		
		//평군 구하기
		avg = (double) tot / count;
		
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avg);
		
			System.out.println("프로그램 종료");
			
	}

}
