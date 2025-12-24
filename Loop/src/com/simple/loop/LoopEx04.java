package com.simple.loop;

public class LoopEx04 {
	public static void main(String[] args) {
		
		//아스키코드표 출력
		char c = 'A';
		//for(int i=0; i<60; i++) {
		//	c++;
		//	System.out.println("문자 :"+c);
		//}
		
		//대문자 A~Z까지만 출력
		//While문을 사용하여 출력
		
		do {
			System.out.print(c);
			System.out.print(" : ");
			System.out.println (c+0);
			c++;
		} while(c <= 'Z'); 
	}

}
