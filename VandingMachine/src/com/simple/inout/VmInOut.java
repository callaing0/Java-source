package com.simple.inout;

import java.util.Scanner;

public class VmInOut {
	public static void main(String[] args) {

		// 1. 변수 준비
		int inCoin = 0;
		String[] coffeeNames = {"밀크커피", "설탕커피", "블랙커피"};
		int[] coffeePrice = {300, 200, 100};
		boolean[] isSale = {false, false, false};
		
		int menu = 0; 
		int vmCoin = 0;
		String coinRepeat = "N";

		Scanner kbd = new Scanner(System.in);

		// 2. 초기 메뉴 출력
		for (int i = 0; i <coffeeNames.length; i++ ) {
		System.out.printf("%s (%d원) %s\n",
				coffeeNames[i], coffeePrice[i], isSale[i] ? "○" : "X");

		}
		
		// 3. 동전 입력 (누적)
		do {
			System.out.print("동전 입력 : ");
			inCoin += kbd.nextInt();   // ★ 누적 입력

			System.out.println("잔액 : " + inCoin);
			System.out.print("동전을 더 입력하시겠습니까? Y/N : ");
			coinRepeat = kbd.next();  // ★ next() 사용

		} while (coinRepeat.equalsIgnoreCase("Y"));

		// 4. 판매 가능 여부 판단
		for (int i = 0; i < coffeePrice.length; i++) {
			if (inCoin >= coffeePrice[i]) {
				isSale[i] = true;
			}
		}

		System.out.printf("\n%s (%d원) %s\n",
				coffeeNames[0], coffeePrice[0], isSale[0] ? "○" : "X");

		// 5. 메뉴 선택
		System.out.println("메뉴 선택 : 밀크커피(1), 설탕커피(2),블랙커피(3)");
		menu = kbd.nextInt();

		switch (menu) {
		case 1:
		case 2:
		case 3:
			int index = menu - 1;
			if (isSale[index]) {
				vmCoin += coffeePrice[index];   // 자판기 수익
				inCoin -= coffeePrice[index];   // 잔액 차감
				System.out.println(coffeeNames[index] + " 나왔습니다.");
			} else {
				System.out.println("잔액이 부족합니다.");
			}
			
		}

		// 6. 판매 후 상태 갱신
		for (int i = 0; i < coffeePrice.length; i++) {
			isSale[i] = inCoin >= coffeePrice[i];
		}

		System.out.printf("%s (%d원) %s\n",
				coffeeNames[0], coffeePrice[0], isSale[0] ? "○" : "X");
		System.out.println("잔액 : " + inCoin);
	}
}