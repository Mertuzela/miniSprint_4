package ru.yandex.praktikum;

public class Praktikum {

    public static void main(String[] args) {
        String checkName = "Тестовое Имя";
        Account account = new Account(checkName);
        boolean result = account.checkNameToEmboss();
        System.out.println(result);
        }
    }