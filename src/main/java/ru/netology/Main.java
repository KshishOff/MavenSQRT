package ru.netology;

import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int amount = service.calculate(100, 300);

        System.out.println("В диапазоне: " + amount);
    }
}