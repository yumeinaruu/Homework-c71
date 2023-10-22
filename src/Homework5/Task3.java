package Homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк и столбцов:");
        int line = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] array = new int[line][col];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(1, 30);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(" " + array[i][j] + " ");
                }
            } else {
                for (int j = (array[i].length - 1); j >= 0; j--) {
                    System.out.print(" " + array[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array));
    }
}
