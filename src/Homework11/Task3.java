package Homework11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[3];
        int average = 0;
        for (int i = 0; i < words.length; i++) {
            System.out.println("Введите " + (i + 1) + " слово:");
            words[i] = scanner.nextLine();
            average += words[i].length();
        }
        average = (int) Math.round((double) average /2);

        for(int i = 0; i < words.length; i++){
            if(words[i].length() < average){
                System.out.println(words[i] + "\t" + words[i].length());
            }
        }
    }
}
