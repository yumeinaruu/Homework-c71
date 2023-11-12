package Homework11.test;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[3];

        for (int i = 0; i < words.length; i++) {
            System.out.println("Введите " + (i + 1) + " слово:");
            words[i] = scanner.nextLine();
        }

        for (int i = 0; i < words.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < words.length; j++) {
                if (words[min].length() > words[j].length()) {
                    min = j;
                }
            }

            if (min != i) {
                String temp = words[i];
                words[i] = words[min];
                words[min] = temp;
            }
        }

        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
}

