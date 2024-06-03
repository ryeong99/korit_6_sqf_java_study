package com.study.java.study.java_study.ch17_컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringHashMapMain {

    public static void main(String[] args) {
        HashMap<Integer, String> strMap = new HashMap<>();
        
        strMap.put(10, "김준일");
        strMap.put(11, "김준이");
        strMap.put(12, "김준삼");
        strMap.put(13, "김준사");

        System.out.println(strMap);
        System.out.println(strMap.get(11));

        Map<String, String> lang = Map.of(
                "java", "자바",
                "c", "C",
                "phython", "파이썬",
                "js", "자바 스크립트"
        );
        System.out.println(lang);
        System.out.println(lang.get("java"));

        Set<Map.Entry<String, String>> entriys = lang.entrySet();

        for (Map.Entry<String, String> entry : entriys) {
            System.out.println("key:" + entry.getKey());
            System.out.println("value:" + entry.getValue());
        }
    }
}
