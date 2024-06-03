package com.study.java.study.java_study.ch16_제네릭;

public class SenderMain {

    public static void main(String[] args) {
        // 일반 자료형은 불가, 객체만 가능

        // Wrapper 자료형
        // Integer      =      int
        // Boolean      =      boolean
        // Character    =      char
        // Double       =      double
        // Long         =      long
        // Float        =      float
        //          (언박싱)-->
        //          <--(박싱)


        Integer num = new Integer(10);  // 박싱
        int num2 = num.byteValue();     // 언박싱

        Integer num3 = 20;  // 자동 박싱
        int num4 = num3;    // 자동 언박싱

        Sender <Integer, String, Double> sender1 = new Sender <Integer, String, Double>(10, "20", 3.14);

        // System.out.println(sender);
    }
}