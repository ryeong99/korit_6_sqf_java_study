package com.study.java.study.java_study.ch04_제어;

public class Star {
    public static void main(String[] args) {
        // i < 5; == 5줄
        // j < 4; == * or " " 4번 반복


        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print("*");
           }
            System.out.println();
        }

        {System.out.println("=====================");}

         for(int i = 0; i < 5; i++) {
             for (int j = 0; j < (5 - i); j++) {
                 System.out.print("*");
             }
             System.out.println();
         }

        {System.out.println("=====================");}

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - 1 - i ; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (1 +i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        {System.out.println("=====================");}

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                 System.out.print(" ");
             }
             for(int j = 0; j < (5 - i ); j++) {
                 System.out.print("*");
             }
             System.out.println();

         }
        {System.out.println("=====================");}

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - 1 - i ; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (i + 1 ) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
