package Homework11.test;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово:");
        String str1 = scanner.nextLine();
        System.out.println("Введите второе слово:");
        String str2 = scanner.nextLine();
        System.out.println("Введите третье слово:");
        String str3 = scanner.nextLine();

        int maxWord = Math.max(Math.max(str1.length(), str2.length()), str3.length());
        System.out.println("Макс. длина: " + maxWord);
        if (str1.length() == maxWord) {
            System.out.println("Эта строка: " + str1);
        } else if (str2.length() == maxWord) {
            System.out.println("Эта строка: " + str2);
        } else {
            System.out.println("Эта строка: " + str3);
        }

        int minWord = Math.min(Math.min(str1.length(), str2.length()), str3.length());
        System.out.println("Мин. длина: " + minWord);
        if (str1.length() == minWord) {
            System.out.println("Эта строка: " + str1);
        } else if (str2.length() == minWord) {
            System.out.println("Эта строка: " + str2);
        } else {
            System.out.println("Эта строка: " + str3);
        }
    }
}
