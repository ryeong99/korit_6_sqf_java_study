package com.study.java.study.java_study.ch06_배열;

public class ArrayUtiles {

    int findNameByName(String[] names, String name) {
        for(int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }
        return  -1;
    }
}
