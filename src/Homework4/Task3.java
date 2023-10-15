package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
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

        Arrays.sort(nums);
        System.out.println("//////////////\nОтсортированный массив: " + Arrays.toString(nums) + "\n//////////////");

        System.out.println("Максимальный элемент: " + nums[(len - 1)] + " Его индекс: " + (len - 1));
        System.out.println("Минимальный элемент: " + nums[0] + " Его индекс: 0");
    }
}
