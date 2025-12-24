package com.simple.classex;

public class Circle2 {

    static final double PI = 3.141592;
    double radius;
    int x, y;
    

	public void setCircle(int r, int x, int y) {
    	radius = r;
    	this.x = x;
    	this.y = y;
    	  	
    }

    // 원 정보 출력
    public void drawCircle() {
        System.out.println("원의 크기 : " + radius);
        System.out.println("원의 위치 : " + x + ", " + y);
    }

    // 원의 면적
    public double getArea() {
        return PI * radius * radius;
    }
}