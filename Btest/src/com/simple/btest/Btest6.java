package com.simple.btest;

import java.util.Random;

public class Btest6 {
    public static void main(String[] args) {
    	
    	
        int[] nansu = new int[10];
        Random rand = new Random();

        for (int i = 0; i < nansu.length; i++) {
            nansu[i] = rand.nextInt(100) + 1;  
        }
        
        // 원본 순서 출력
        System.out.println("원본 순서:");
        for (int i = 0; i < nansu.length; i++) {
            System.out.print(nansu[i] + " ");
        }

        // 역순 출력
        System.out.println("\n역순:");
        for (int i = nansu.length - 1; i >= 0; i--) {
            System.out.print(nansu[i] + " ");
        }
    }
}
        

