package com.study.java.study.java_study.ch22_예외;

/*
    예외(오류)
        1. 컴파일 오류 : 프로그램이 실행(메모리 할당) 전 오류 발생
        2. 런타임 오류 : 프로그램이 실행(메모리 할당) 된 후 오류
 */

public class ArrayExceptionMain {

    public static void printArray(Integer[] nums, int length) throws Exception {
        try {
            for (int i = 0; i < length; i++) {
                System.out.println("i: " + nums[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();        // 비동기처리
        }
    }

    public static void main(String[] args) throws Exception {
        Integer[] nums = new Integer[] {1,2,3,4,5};

        try {
            printArray(nums,6);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }
}
