package com.simple.loop;

public class LoopEx02 {
	public static void main(String[] args) {
		
		//구구단
		
		for(int i=1; i <= 9; i++) {
			//System.out.println(2+"x"+i+"="+(2*i));
			System.out.printf("2 x %2d = %2d \n",i,(2*i));
		}
		
		System.out.println();
		
		for(int i=1; i <= 9; i++) {
			//System.out.println(2+"x"+i+"="+(2*i));
			System.out.printf("3 x %2d = %2d \n",i,(2*i));
		}
		
	}

}
