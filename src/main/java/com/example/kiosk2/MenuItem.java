package com.example.kiosk2;

public class MenuItem {

    // 햄버거 필드
    String burgerName; // 햄버거 이름
    double burgerPrice; // 햄버거 가격
    String burgerDescription; // 햄버거 설명
    String strBurger; // 완성된 햄버거 문장

    // 생성자
    public MenuItem (String burgerName, double burgerPrice, String burgerDescription) {
        this.burgerName = burgerName;
        this.burgerPrice = burgerPrice;
        this.burgerDescription = burgerDescription;

        this.strBurger = burgerName + "   | W " + burgerPrice + " | " + burgerDescription;
    }
}
