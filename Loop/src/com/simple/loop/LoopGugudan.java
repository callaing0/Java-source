package com.simple.loop;

public class LoopGugudan {
	public static void main(String[] args) {
		
		//구구단
		
		for(int i=2; i <= 9; i++) {		
			
			System.out.print("------ %d 단------\n");
			
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %2d = %2d \n",i,j,(i*j));
			}
			System.out.println();
		}
		
	}

}
