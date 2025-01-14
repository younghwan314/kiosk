package com.example.kiosk2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // List 선언 및 초기화
        List<MenuItem> burgerMenu = new ArrayList<>();

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List 에 삽입
        // (add 보다 더 좋은 방법이 있다면 그렇게 해도 됩니다!)
        MenuItem ShackBurger = new MenuItem("ShackBurger ", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        burgerMenu.add(ShackBurger);
        MenuItem SmokeShack = new MenuItem("SmokeShack  ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        burgerMenu.add(SmokeShack);
        MenuItem Cheeseburger = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        burgerMenu.add(Cheeseburger);
        MenuItem Hamburger = new MenuItem("Hamburger   ", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
        burgerMenu.add(Hamburger);

        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        // 반복문을 활용해 List 안에 있는 MenuItem 을 하나씩 출력
        boolean run = true;

        while (run) {
            System.out.println("[ SHAKESHACK MENU ]");

            for (int i = 0; i < burgerMenu.size(); i++) {
                System.out.println((i + 1) + ". " + burgerMenu.get(i).strBurger);

                // 종료
                if ((i - 3) == 0) {
                    System.out.println((i - 3) + ". 종료");
                }
            }


            // 숫자를 입력 받기
            int menuNumber = sc.nextInt();

            System.out.println(); // 한 줄 내리기

            // 입력된 숫자에 따른 처리
            // 선택한 메뉴 : 이름, 가격, 설명
            if (Objects.equals(1, menuNumber)) {
                System.out.println("선택된 메뉴 : " + burgerMenu.get(0).strBurger);
            } else if (Objects.equals(2, menuNumber)) {
                System.out.println("선택된 메뉴 : " + burgerMenu.get(1).strBurger);
            } else if (Objects.equals(3, menuNumber)) {
                System.out.println("선택된 메뉴 : " + burgerMenu.get(2).strBurger);
            } else if (Objects.equals(4, menuNumber)) {
                System.out.println("선택된 메뉴 : " + burgerMenu.get(3).strBurger);
            } else if (Objects.equals(0, menuNumber)) {
                // 프로그램을 종료
                System.out.println("프로그램을 종료합니다.");
                run = false;
            }

            System.out.println(); // 한 줄 띄우기
        }
    }
}
