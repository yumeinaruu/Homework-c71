package Homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[2][3];
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(1, 15);
                System.out.println("Какое число вы хотите прибавить к элементу на " + (i+1) +
                        " строке и " + (j+1) + " столбце?");
                array[i][j] += scanner.nextInt();
                sum += array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(sum);
    }
}
