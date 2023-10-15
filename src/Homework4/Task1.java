package Homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = scanner.nextInt();
        int[] nums = new int[len];
        System.out.println("Заполнить массив: 1)Вручную   2)Рандомно");
        int choice = scanner.nextInt();
        if (choice == 1) {
            for (int i = 0; i < len; i++) {
                System.out.println("Введите " + (i + 1) + "-ое число: ");
                nums[i] = scanner.nextInt();
            }
        } else if (choice == 2) {
            for (int i = 0; i < len; i++) {
                nums[i] = (int) (Math.random() * 100);
            }
        } else {
            System.out.println("Введите 1 или 2");
            return;
        }

        while (true) {
            System.out.println("Для того чтобы просмотреть переменные в прямом порядке - 1\nВ обратном - 2");
            System.out.println("Чтобы выйти из программы нажмите любую другую цифру");
            choice = scanner.nextInt();
            if (choice == 1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(nums[i] + " ");
                }
                System.out.println();
            } else if (choice == 2) {
                for (int i = (len - 1); i >= 0; i--) {
                    System.out.print(nums[i] + " ");
                }
                System.out.println();
            } else {
                break;
            }
        }
    }
}
