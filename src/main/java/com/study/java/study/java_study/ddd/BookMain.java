package com.study.java.study.java_study.ddd;

public class BookMain {

    public static void main(String[] args) {
        BookService bookService = new BookService();

        System.out.println("프로그램을 실행합니다.");

        while (bookService.run()) {}

        System.out.println("프로그램을 종료합니다.");

        // 엔티티 레파지토리 서비스 메인
        // 메인 서비스 레파지토리 엔티티
    }

}