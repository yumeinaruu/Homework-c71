package Homework11.test;

import java.util.Scanner;

public class Reverse {

    //пока я делал пятое задание я случайно сделал реверс

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        char[] sbChar = sb.toString().toCharArray();
        for (int i = 0; i < sbChar.length; i++) {
            sb.insert(sb.toString().length() - i, sbChar[i]);
        }
        System.out.println(sb);
    }
}
