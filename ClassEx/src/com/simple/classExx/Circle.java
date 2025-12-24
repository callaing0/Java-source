package com.simple.classExx;

public class Circle {

    static final double PI = 3.141592;

    private String name;
    private double radius;
    private int x, y;

    // 기본 생성자
    public Circle() {
        this("MyCircle", 5, 10, 20);
    }

    // 이름 + 반지름 생성자
    public Circle(String name, double radius) {
        this(name, radius, 10, 20);
    }

    // 전체 필드 생성자
    public Circle(String name, double radius, int x, int y) {
        this.name = name;
        this.radius = radius;
        this.x = x;
        this.y = y;

        System.out.println("생성자 호출");
        System.out.println("생성자 매개변수 : " + radius);
    }

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

    @Override
    public String toString() {
        return "Circle{name='" + name + "', radius=" + radius +
               ", x=" + x + ", y=" + y + "}";
    }
}