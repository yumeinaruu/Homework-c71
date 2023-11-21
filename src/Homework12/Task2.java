package Homework12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String text = "teachmeskills@gmail.com 1423-1512-51 +375294561234";

        Pattern pattern = Pattern.compile("\\+\\d{12}");
        Matcher matcher = pattern.matcher(text);
        System.out.println("Number: ");
        while (matcher.find()){
            System.out.print(matcher.group());
        }

        pattern = Pattern.compile("[A-z]+@[A-z]+\\.[A-z]+");
        matcher = pattern.matcher(text);
        System.out.println("\nEmail: ");
        while (matcher.find()){
            System.out.print(matcher.group());
        }

        pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        System.out.println("\nDocument number: ");
        matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
