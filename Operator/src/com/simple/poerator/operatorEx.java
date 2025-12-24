package com.simple.poerator;

public class operatorEx {
	public static void main(String[] args) {
		// 논리 연산자
		//&&, ||, ! 
		// 자격증 시험 합격여부 판단
		// 1차 필기 60점 이상이고 과목은 국어,영어,수학
		//과목점수는 최소 40점 이상
		
		
		//입출력 변수 설계(준비)
		int jum1 = 90; //1차 필기점수
		int kor = 90; //국어 점수
		int eng = 30; //영어 점수
		int mat = 90; //수학 점수
		double avg;

		
		// String pass = "합격"
		boolean pass1; //과목과락 합격여부
		boolean pass2; //평균점수 합격여부 
		
		// 과목과락체크
		pass1 = (kor >= 40) && (eng >= 40) && (mat >= 40);

		//평균점수
		avg = (double)((kor + eng + mat) / 3); 
		pass2 = pass1 && (avg >= 60);
				
		
		//결과 출력
		System.out.println("국어 :"+kor);
		System.out.println("영어 :"+eng);
		System.out.println("수학 :"+mat);
		System.out.println("평균 :"+avg);
		System.out.println("합격 :"+pass2);

		
	}

}
