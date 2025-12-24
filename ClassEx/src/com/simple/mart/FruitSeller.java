package com.simple.mart;

public class FruitSeller {
	private int numOfApple;
	private int myMoney;
	final int APPLE_PRICE;
	
	public FruitSeller(int numOfApple, int myMoney, int aPPLE_PRICE) {
		super();
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
		APPLE_PRICE = aPPLE_PRICE;
	}
	
	public int saleApple(int money) {
		int num = money/APPLE_PRICE;
		myMoney += money;
		numOfApple =+ num;
		showSaleResult();
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("남은 사과 : "+numOfApple);
		System.out.println("판매 수익 : "+myMoney);
		
		
	}

	
		
	
	

}
