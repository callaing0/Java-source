package com.simple.Book;

public class Book {
    String title;
    String author;

    // 기본 생성자
    public Book() {
        this("아무 책");
        System.out.println("기본 생성자");
    }

    // 제목만 받는 생성자
    public Book(String title) {
        this(title, "홍길동");
        System.out.println("제목 생성자");
    }

    // 제목 + 저자 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("제목, 저자 생성자");
    }
    
    private void showBook() {
    	System.out.println("책 이름 : "+title);
    	System.out.println("책 저자 : "+author);
	
	}
    
    // 객체 생성 및 사용
    public static void main(String[] args) {
    	Book book1 = new Book();
		book1.showBook();
    	
	}
}