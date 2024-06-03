package com.study.java.study.java_study.ch15_Static;

import java.security.PrivateKey;

public class StudentRepository {
    private String[] names;

    private static StudentRepository instance;               // 1. 자기 자신을 담을 수 있는 변수 필요

    private  StudentRepository() {                           // 2. 외부에서 생성 X -> private
        names = new String[5];
    }

    public  static  StudentRepository getInstance() {        // 3. public static으로 외부에서 호출가능
        if(instance == null) {
            instance = new StudentRepository();
        }
        return instance;                                     // 4. 대신 자기 자신 리턴
     }

     public void add(String name) {
        for(int i =0 ; i < names.length; i++) {
            if (names[i] == null) {
                names[i] = name;
                break;
            }
         }
     }
     public  String[] getNames()  {
        return names;
    }
}
