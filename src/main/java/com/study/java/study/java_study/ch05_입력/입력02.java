package com.study.java.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력02 {
    public static void main(String[] args) {
        String name =  null;    //next()
        int age = 0;            //nextInt()
        String adress =  null;  //nextLine()
        String gender =  null;  //next()
        String phone =  null;   //nextLine()

        /*
        이름 : 김준일
        나이 : 31
        주소 : 동래구
        성별 : 남
        연락처 : 010-9988-1916
         */


        Scanner scanner = new Scanner(System.in);

        System.out.print("이름: ");
        name = scanner.next();

        System.out.print("나이: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("주소: ");
        adress = scanner.nextLine();

        System.out.print("성별: ");
        gender = scanner.next();
        scanner.nextLine();

        System.out.print("연락처: ");
        phone = scanner.nextLine();

        System.out.println();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("주소: " + adress);
        System.out.println("성별: " + gender);
        System.out.println("연락처: " + phone);
    }
}
