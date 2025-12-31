package com.simple.btest;

import java.util.Random;

public class Btest8 {
    public static void main(String[] args) {

        int[] nansu = new int[10];
        Random rand = new Random();

        for (int i = 0; i < nansu.length; i++) {
        	nansu[i] = rand.nextInt(100);
        }

        // 전체 배열 출력
        System.out.println("배열 전체 값:");
        for (int i = 0; i < nansu.length; i++) {
            System.out.print(nansu[i] + " ");
        }

        // 교환 후 출력
        int temp = nansu[0];                   
        nansu[0] = nansu[nansu.length - 1];    
        nansu[nansu.length - 1] = temp;        

        // 교환 후 배열 출력
        System.out.println("\n\n교환 후 배열:");
        for (int i = 0; i < nansu.length; i++) {
            System.out.print(nansu[i] + " ");
        }
    }
}
