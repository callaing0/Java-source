package com.simple.classex;

public class CircleTest {

    public static void main(String[] args) {
        // Circle Test

        // 1️⃣ 생성자 사용
        Circle c1 = new Circle(100, 5, 6, "bigCircle");
        Circle c2 = new Circle(10, 5, 6, "miniCircle");

        // 원 정보 출력
        c1.drawCircle();
        c2.drawCircle();

        // 원 면적 계산
        double area1 = c1.getArea();
        double area2 = c2.getArea();

        // 이름 출력
        System.out.println("원의 이름 : " + c2.getName());
        System.out.println("원의 이름 : " + c1.getName());

        // 면적 출력
        System.out.println("원의 면적 : " + area1);
        System.out.println("원의 면적 : " + area2);
    }
}
