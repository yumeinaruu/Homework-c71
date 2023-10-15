package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
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

        System.out.println("//////////////\n" + Arrays.toString(nums) + "\n//////////////");

        arrayMax(nums);
        arrayMin(nums);

    }

    static void arrayMax(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= temp) {
                temp = nums[i];
            }
        }
        System.out.println("Максимальный элемент: " + temp);
    }

    static void arrayMin(int[] nums) {
        int temp = 101;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < temp) {
                temp = nums[i];
            }
        }
        System.out.println("Минимальный элемент: " + temp);
    }
}
