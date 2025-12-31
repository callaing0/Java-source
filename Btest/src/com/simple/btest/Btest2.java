package com.simple.btest;

import java.util.Random;

public class Btest2 {
    public static void main(String[] args) {
    	
    	//배열의 합과 평균 구하기
    	
        int[] nansu = new int[10];
        Random rand = new Random();
        int sum = 0;

        
        for (int i = 0; i < nansu.length; i++) {
            nansu[i] = rand.nextInt(100) + 1;
        }
        
        System.out.println("배열 전체 값:");
        for (int i = 0; i < nansu.length; i++) {
            System.out.print(nansu[i] + " ");
        }
        
        for (int i = 0; i < nansu.length; i++) {
        	sum += nansu[i];
        }
        
        int average = sum / nansu.length;
        System.out.println("합계 : "+sum);
        System.out.print("평균 : "+average);
    }
}
