package com.study.java.study.java_study.ch04_제어;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("개수: ");
        int count = scanner.nextInt();

        int i = 0;
        while (i < count) {
            if(i % 2 == 0) {
                System.out.println("짝수입니다.");
                i++;
                continue;
            }
            System.out.println("홀수입니다.");
            i++;
        }


//        for(int j = 0; j < count; j++) {
//            if(i % 2 == 0) {
//                System.out.println("짝수입니다.");
//                continue;
//            }
//            System.out.println("홀수입니다.");
//        }

    }
}
