package com.simple.btest;

import java.util.Random;

public class Btest4 {
    public static void main(String[] args) {

        int[] nansu = new int[10];
        Random rand = new Random();

        int evenCount = 0; 
        int oddCount = 0;  

     
        for (int i = 0; i < nansu.length; i++) {
            nansu[i] = rand.nextInt(100) + 1;
        }
        
        System.out.println("배열 전체 값:");
        for (int i = 0; i < nansu.length; i++) {
            System.out.print(nansu[i] + " ");
         
            if (nansu[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

       
        System.out.println("\n 짝수 개수 : " + evenCount);
        System.out.println("홀수 개수 : " + oddCount);
    }
}
