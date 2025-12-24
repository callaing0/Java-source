package com.simple.loop;

import java.util.Scanner;

public class LoopjumsuChart {
	public static void main(String[] args) {
		
		//점수에 해당되는 별점 표시
		//점수에 별점을 10으로 나눠서 출력
		
		Scanner kbd = new Scanner(System.in);
		
		
		int kor = 33;	
		int starSize = kor/10;
		
		System.out.print("국어 : ");
		
		System.out.print("원하는 모양을 입력하세요: ");
		String shape = kbd.nextLine(); 
		
		for(int i=0; i < starSize; i++) {	
			System.out.print(shape);
		}
		
		//영어
		
		int eng = 44;
		starSize = eng/10;

		System.out.print("영어 : ");
		
		System.out.print("원하는 모양을 입력하세요: ");
		shape = kbd.nextLine(); 
		
		for(int i=0; i < starSize; i++) {	
			System.out.print(shape);
		}
		
		//수학
		
		int mat = 55;
		starSize = mat/10;
		
		System.out.print("수학 : ");
		
		System.out.print("원하는 모양을 입력하세요: ");
		shape = kbd.nextLine(); 
		
		for(int i=0; i < starSize; i++) {	
			System.out.print(shape);
		}
		
	}

}
