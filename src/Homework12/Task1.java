package Homework12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("[А-ЯA-Z]{2,6}");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
