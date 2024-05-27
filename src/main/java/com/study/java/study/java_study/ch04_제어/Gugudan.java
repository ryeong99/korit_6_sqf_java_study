package com.study.java.study.java_study.ch04_제어;

public class Gugudan {
    public static void main(String[] args) {
        for(int i = 0; i < 8; i++) {
            int dan = i + 2;
            System.out.println(i + 2 + "단");
            for (int j = 0; j < 9; j++) {
                int num = j + 1;
                System.out.println((dan) + " x " +(num) + " = " + ((dan)*(num)) );
            }
            System.out.println();
        }
    }
}
