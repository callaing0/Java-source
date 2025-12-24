package com.simple.classet;

public class Circle {

    private double radius;
    private int x, y;
    private String name;
    static final double PI = 3.141592;

    // 반지름과 위치 설정
    public void setCircle(double radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    // 이름 설정/가져오기
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 면적 계산
    public double getArea() {
        return PI * radius * radius;
    }
}
