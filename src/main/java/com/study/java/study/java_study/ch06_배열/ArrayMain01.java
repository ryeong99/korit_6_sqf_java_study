package com.study.java.study.java_study.ch06_배열;

public class ArrayMain01 {

    public static void main(String[] args) {

        int [] nums = new int [100];

        for(int i = 0; i < 100; i++) {
            nums[i] = (i + 1) * 10;
        }
        for(int num:nums) {
            System.out.println(num);
        }

        System.out.println("------------------------------------");

        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                continue;
            }
            int num = nums[i];
            System.out.println(num);
        }

//        nums[1] = 20;

//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
//        System.out.println(nums[2]);
//        System.out.println(nums[3]);
    }

}
