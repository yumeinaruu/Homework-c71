package Homework16.task3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] text = scanner.nextLine().toCharArray();
        if (text.length % 2 != 0) {
            System.out.println(false);
            System.exit(0);
        }
        int count = 0;
        for (int i = 0; i < text.length / 2; i++) {
            if (text[i] + 1 == (text[text.length - 1 - i]) - 1 || text[i] + 1 == (text[text.length - 1 - i])) {
                count++;
            }
        }
        if(count == text.length/2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
