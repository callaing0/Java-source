package com.simple.btest;

import java.util.Random;

public class Btest10 {
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

        // 버블 정렬
        for (int i = 0; i < nansu.length - 1; i++) {
            for (int j = 0; j < nansu.length - 1 - i; j++) {
                if (nansu[j] > nansu[j + 1]) {
                    
                	// 두 요소 교환
                    int temp = nansu[j];
                    nansu[j] = nansu[j + 1];
                    nansu[j + 1] = temp;
                }
            }
        }

        // 배열 출력 (정렬 후)
        System.out.println("정렬 후 배열 (오름차순):");
        for (int num : nansu) {
            System.out.print(num + " ");
        }
    }
}

        

