package com.study.java.study.java_study.ch04_제어;

public class StringUtils {

    boolean isEmpty(String str) {
        //System.out.println(str);
        if(str == null) {
            return true;
        }
        return str.equals("");
            //return str == null || str.equals("");
    }
}
