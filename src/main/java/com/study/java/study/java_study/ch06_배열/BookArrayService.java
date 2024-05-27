package com.study.java.study.java_study.ch06_배열;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class BookArrayService {

    public static void main(String[] args) {

        BookArrayUrils bookArrayUrils = new BookArrayUrils();

        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];
        boolean isRun = true;

        while (isRun) {
            System.out.println("책 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("q. 프로그램 종료");
            System.out.println("메뉴 선택: ");

            String selectedMenu = scanner.nextLine();

            String[] newNames = null;
            int serchName = -1;

            switch (selectedMenu) {
                case "1":
                    System.out.println("책 등록");
                    newNames = new String[names.length + 1];
                    for (int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.println("등록 할 책 이름");
                    names[names.length - 1] = scanner.nextLine();
                    System.out.println("책 이름이 등록되었습니다.");
                    break;

                case "2":
                    System.out.println("[책 수정]");
                    System.out.println("수정 할 책 이름");
                    String oneName = scanner.nextLine();
                    serchName = bookArrayUrils.AdminName(names, oneName);
                    if (serchName == -1) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    System.out.println("새 이름");
                    names[serchName] = scanner.nextLine();
                    System.out.println("수정완료");
                    break;
                case "3":
                    System.out.println("책 삭제");
                    System.out.println("삭제 할 책 이름");
                    String twoName = scanner.nextLine();
                    serchName = bookArrayUrils.AdminName(names, twoName);
                    if (serchName == -1) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    newNames = new String[names.length - 1];
                    for (int i = 0; i < newNames.length; i++) {
                        if (i < serchName) {
                            newNames[i] = names[i];
                            continue;
                        }
                        newNames[i] = names[1 + i];
                    }
                    names = newNames;
                    System.out.println(serchName + "을(를) 삭제하였습니다.");
                    break;

                case "4":
                    isRun = false;
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("다시 입력하세요.");
            }
        }
        System.out.println();
    }
}
