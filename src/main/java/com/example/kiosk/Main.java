package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner 를 사용하기 위한 코드
        Scanner sc = new Scanner(System.in);

        // 햄버거 메뉴를 담을 리스트
        List<String> burgerMenu = new ArrayList<>();

        // 리스트에 메뉴 추가
        burgerMenu.add("ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        burgerMenu.add("SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        burgerMenu.add("Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        burgerMenu.add("Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");

        // 반복문 작동을 위한 변수
        boolean run = true;

        // 메뉴 출력 후 번호 입력받고 출력하는 반복문
        while (run) {
            // 메뉴 출력
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < burgerMenu.size(); i++) {
                System.out.println((i + 1) + ". " + burgerMenu.get(i));
                // 종료 출력
                if (i - 3 == 0) {
                    System.out.println((i - 3) + ". " + "종료");
                }
            }

            // 메뉴 번호를 입력받는다.
            int menuNumber = sc.nextInt();

            System.out.println(); // 한 줄 내리기

            // 입력받은 번호에 따라 조건문 작동
            if (Objects.equals(1, menuNumber)) {
                System.out.println("선택한 메뉴 : " + burgerMenu.get(0));
            } else if (Objects.equals(2, menuNumber)) {
                System.out.println("선택한 메뉴 : " + burgerMenu.get(1));
            } else if (Objects.equals(3, menuNumber)) {
                System.out.println("선택한 메뉴 : " + burgerMenu.get(2));
            } else if (Objects.equals(4, menuNumber)) {
                System.out.println("선택한 메뉴 : " + burgerMenu.get(3));
            } else if (Objects.equals(0, menuNumber)) {
                System.out.println("프로그램을 종료합니다.");
                run = false;
            }

            System.out.println(); // 다음 메뉴와 한 줄 띄우기
        }
    }
}
