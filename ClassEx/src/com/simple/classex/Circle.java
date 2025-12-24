package com.simple.classex;

public class Circle {

    static final double PI = 3.141592;
    String name;
    double radius;
    int x, y;

    // - 생성자 예시 - 
    
    public Circle() {
		this.name = "MyCircle";
		this.radius = 5;
		this.x = 10;
		this.y = 20;
		System.out.println("생성자 호출");
		System.out.println("생성자 매개변수 : "+radius);
	}
    
    
    public Circle(String name, double radius) {
		super();
		this.name = name;
		this.radius = radius;
		x = 10;
		y - 20;
	}



	public Circle(String name, double radius, int x, int y) {
		super();
		this.name = name;
		this.radius = radius;
		this.x = x;
		this.y = y;
		System.out.println("생성자 호출");
		System.out.println("생성자 매개변수 : "+radius);
	}
	

	
	// - 생성자 예시 -

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	
	// 원 정보 출력
    public void drawCircle() {
        System.out.println("원의 반지름 : " + radius);
        System.out.println("원의 위치 : " + x + ", " + y);
    }

    // 원의 면적
    public double getArea() {
        return PI * radius * radius;
    }
}