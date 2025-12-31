package com.simple.btest;

import java.util.Random;
import java.util.Scanner;

public class Btest5 {
    public static void main(String[] args) {
    	
        int[] nansu = new int[10];
        Random rand = new Random();

        
        for (int i = 0; i < nansu.length; i++) {
            nansu[i] = rand.nextInt(100) + 1;
        }
        
        System.out.println("배열 전체 값:");
        for (int i = 0; i < nansu.length; i++) {
            System.out.print(nansu[i] + " ");
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\n 원하는 숫자를 입력하시오");
        int num = sc.nextInt();
      
        
        for (int i = 0; i < nansu.length; i++) {
        	if (num == nansu[i]) {	
        		System.out.println("입력하신 숫자 :"+num);
        		System.out.println((i + 1) + "번째 요소값에 있습니다.");
        		break;
        	} 
        }
    }
}
