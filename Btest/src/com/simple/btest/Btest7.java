package com.simple.btest;

import java.util.Random;

public class Btest7 {
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

        // 50 이상인 값만 출력
        System.out.println("\n\n50 이상인 값:");
        for (int i = 0; i < nansu.length; i++) {
            if (nansu[i] >= 50) {
                System.out.print(nansu[i] + " ");
            }
        }
    }
}
