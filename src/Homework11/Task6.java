package Homework11;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова через пробел:");
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        System.out.println("Какое из слов вы хотите проверить на палиндром?");
        int getWord = 0;
        while (true) {
            getWord = (scanner.nextInt() - 1);
            if (getWord >= words.length || getWord < 0) {
                System.out.println("Такого индекса нет, попробуй снова");
            } else {
                break;
            }
        }
        char[] wordsChars = words[getWord].toCharArray();
        for (int i = words[getWord].length() - 1; words[getWord].length() == 2 ? i >= words[getWord].length() / 2 : i > words[getWord].length() / 2; ) {
            for (int j = 0; j < words[getWord].length() / 2; j++) {
                if (wordsChars[i] != wordsChars[j]) {
                    System.out.println("Это не палиндром");
                    System.exit(0);
                }
                i--;
            }
        }
        System.out.println(words[getWord] + " - палиндром");
    }
}
