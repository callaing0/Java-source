package com.simple.classExx;

public class CircleTest2 {
	public static void main(String[] args) {
		
	
	//객체 배열
	Circle[] circle;
	circle = new Circle[5];
	
	for(int i = 0; i<circle.length; i++) {
		circle[i] = new Circle();
	}
	
	for(int i = 0; i<circle.length; i++) {
		System.out.println("주소"+circle[i].hashCode());
		System.out.println("원의 "+i+"번째 면적 :"+circle[i].getArea());
	}	

	}

}
