package Homework11;

import java.util.Scanner;

public class Task1Better {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[3];
        int max = 0;
        int min = 0;
        for (int i = 0; i < words.length; i++) {
            System.out.println("Введите " + (i + 1) + " слово");
            words[i] = scanner.nextLine();
            if (words[i].length() >= words[max].length()) {
                max = i;
            }
            if (words[i].length() <= words[min].length()) {
                min = i;
            }
        }
        System.out.println("Наибольшее - " + words[max] + "\nНаименьшее - " + words[min]);
    }

}
