package com.simple.btest;

import java.util.Random;

public class Btest3 {
    public static void main(String[] args) {
    	
    	//배열의 최대값, 최소값 찾기
    	
        int[] nansu = new int[10];
        Random rand = new Random();

        for (int i = 0; i < nansu.length; i++) {
            nansu[i] = rand.nextInt(100) + 1;
        }
        
        System.out.println("배열 전체 값:");
        for (int i = 0; i < nansu.length; i++) {
            System.out.print(nansu[i] + " ");
        }

        int max = nansu[0];
        int min = nansu[0];

        for (int i = 1; i < nansu.length; i++) {
            if (nansu[i] > max) {
                max = nansu[i];
            }
            if (nansu[i] < min) {
                min = nansu[i];
            }
        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
