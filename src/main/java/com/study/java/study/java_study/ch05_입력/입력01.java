package com.study.java.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        String a = scanner.next();
        System.out.println(a);
        /*
            next() 메소드 특징

            1. 공백과 줄바꿈(엔터) 무시
            2. 버퍼를 사용한다.

         */

        System.out.print("b: ");
        String b = scanner.nextLine();
        System.out.println("비: " + b);

    }
}
