package com.simple.btest;

import java.util.Random;

public class Btest1 {
    public static void main(String[] args) {
    	
    	//배열에 난수 채우기
    	
        int[] nansu = new int[10];
        Random rand = new Random();

        for (int i = 0; i < nansu.length; i++) {
            nansu[i] = rand.nextInt(100) + 1;
        }
        
        System.out.println("배열 전체 값:");
        for (int i = 0; i < nansu.length; i++) {
            System.out.print(nansu[i] + " ");
        }
    }
}
