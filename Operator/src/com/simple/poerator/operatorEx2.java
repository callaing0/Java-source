package com.simple.poerator;

public class operatorEx2 {
    public static void main(String[] args) {

        int birthYear = 2005;   // 출생 연도
        int currentYear = 2025; // 현재 연도

        int age = currentYear - birthYear;

        if (age >= 19) {
            System.out.println("나이: " + age);
            System.out.println("성인입니다.");
        } else {
            System.out.println("나이: " + age);
            System.out.println("미성년자입니다.");
        }
    }
}