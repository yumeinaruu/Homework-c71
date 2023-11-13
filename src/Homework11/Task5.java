package Homework11;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        char[] sbChar = sb.toString().toCharArray();
        for (int i = 0; i < sb.toString().length(); i+=2) {
            sb.insert(i, sbChar[Math.round((float) i /2)]);
        }
        System.out.println(sb);
    }
}
