package com.study.java.study.java_study.ch22_예외;

public class ArrayExceptionMain {
    
/*
    예외(오류)
        1. 컴파일 오류 : 프로그램이 실행(메모리 할당) 전 오류 발생
        2. 런타임 오류 : 프로그램이 실행(메모리 할당) 된 후 오류
 */
    
    public static void main(String[] args) {
        Integer[] nums = new Integer[] {1,2,3,4,5};

        try {


            for (int i = 0; i < 6; i++) {
                System.out.println("i: " + nums[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("프로그램 종료");
    }
}
