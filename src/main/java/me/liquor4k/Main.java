package me.liquor4k;

public class Main {
    public static void main(String[] args) {
        // Задача 1: Проверка совершеннолетия
        System.out.println("=== ЗАДАЧА 1 ===");
        int age1 = 20;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача 2: Проверка температуры для шапки
        System.out.println("\n=== ЗАДАЧА 2 ===");
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // Задача 3: Проверка скорости
        System.out.println("\n=== ЗАДАЧА 3 ===");
        int speed = 65;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
}