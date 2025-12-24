package com.simple.classex;

public class ShapeTest {
	public static void main(String[] args) {
		
	//원을 생성
	Circle c1;
	
	c1 = new Circle("큰원", 100, 20, 30);
	
	//c1.setCircle(5, 5, 8);
	//c1.setName("동글이");
	

	System.out.println("원의 이름 : "+c1.name);
	System.out.println("원의 반지름 : "+c1.radius);
	System.out.println("원의 X : "+c1.getX());
	System.out.println("원의 Y : "+c1.getY());
	System.out.println("원의 면적 : "+c1.getArea());



  }
}
