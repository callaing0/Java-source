package com.simple.btest;

import java.util.Random;
import java.util.Scanner;

public class Btest9 {
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
        
        int count = 0;
        System.out.println("입력하신 숫자 :"+num);
      
        
        for (int i = 0; i < nansu.length; i++) {
        	if (num == nansu[i]) {	
        		count++;
        	} 
        }
        
        System.out.println(num + "은(는) 배열에서 " + count + "번 등장합니다.");

        sc.close();
    }
}
