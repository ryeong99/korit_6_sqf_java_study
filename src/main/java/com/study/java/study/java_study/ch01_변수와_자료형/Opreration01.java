package com.study.java.study.java_study.ch01_변수와_자료형;

public class Opreration01 {
    public static void main(String[] args) {

    // 연산자

    // 산술연산자
    int num1 = 10 + 20;
    int num2 = 9 / 2;
    System.out.println(num2);
    int num3 = 9 % 2;
    System.out.println(num3); // 2로 나눈뒤 나머지 값을 출력
    boolean num4 = 4 % 2 == 0;
    System.out.println(num4);

    System.out.println("-----------------");

    // 증감연산
        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i--);

    //논리 연산자
        // true = 1
        // false = 0
        // && = AND (곱)
        // || = OR (합)
        // !! = NOT (부정)
        System.out.println(true && true);
        System.out.println(true && false); // 두 개 모두 트루일 경우 트루
        System.out.println(true || true); // 둘 중 하나라도 트루일 경우 트루
        System.out.println(false || false);
        System.out.println(!(true && true));

        System.out.println("-----------------");

    // 관계연산자
        System.out.println(3 > 2 && 1 == 1);
        System.out.println(1 != 1);

        System.out.println("-----------------");

    // 조건연산자
        System.out.println(3 > 2 ? 10 : 20 ); // 참일 경우 10출력 거짓일 경우 20 출력
        int x = 10;
        int y = 20;
        String result = x % y == 0 ? "y의 배수입니다." : "y의 배수가 아닙니다."; // 0이 나올경우 "배수입니다" 출력
        String resilt2 = "" + 10 / 2;

        System.out.println("-----------------");

    // 복합대입연산자
        int number = 10;
        number += 5;
        number -= 1;
        number *= 2;
        number /= 2;
        number %= 2;


    }
}
