package Homework11;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[3];

        for (int i = 0; i < words.length; i++) {
            boolean hasSame = true;
            System.out.println("Введите " + (i + 1) + " слово:");
            words[i] = scanner.nextLine();
            char[] array = words[i].toCharArray();
            for (int j = 0; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[k] == array[j]) {
                        hasSame = false;
                        break;
                    }
                }
            }
            if (hasSame) {
                System.out.println(words[i] + " - не имеет одинаковых букв");
                System.exit(0);
            }
        }
    }
}
