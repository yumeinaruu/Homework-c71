package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = scanner.nextInt();
        int[] nums = new int[len];
        System.out.println("Заполнить массив: 1)Вручную   2)Рандомно");
        int choice = scanner.nextInt();
        if (choice == 1) {
            for (int i = 0; i < len; i++) {
                System.out.println("Введите " + (i + 1) + "-ое число от 0 до 9: ");
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

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 9) {
                nums[i] += 1;
                System.out.println(Arrays.toString(nums));
                System.exit(1);
            } else if (nums[i] == 9 && i != 0) {
                nums[i] = 0;
            }

        }
        int[] numsNew = new int[nums.length + 1];
        numsNew[0] = 1;
        System.out.println(Arrays.toString(numsNew));
    }
}
