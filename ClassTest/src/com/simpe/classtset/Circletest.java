package com.simpe.classtset;

public class Circletest {

    private double width;
    private double height;
    private String name;

    // 너비와 높이 설정
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
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
        return width * height;
    }
}
