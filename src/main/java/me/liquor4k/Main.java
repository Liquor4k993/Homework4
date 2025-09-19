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

        // Задача 4: Определение учебного заведения
        System.out.println("\n=== ЗАДАЧА 4 ===");
        int age2 = 15;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age2 + ", то ему еще рано куда-либо ходить");
        }

        // Задача 5: Аттракционы
        System.out.println("\n=== ЗАДАЧА 5 ===");
        int childAge = 10;
        boolean hasAdult = true;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge < 14) {
            if (hasAdult) {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе без сопровождения взрослого");
            }
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        // Задача 6: Вагон поезда
        System.out.println("\n=== ЗАДАЧА 6 ===");
        int passengers = 75;
        if (passengers < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (passengers < 102) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
    }
}