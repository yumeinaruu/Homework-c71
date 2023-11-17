package Homework12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String text1 = "teachmeskills@gmail.com 1423-1512-51 +375294561234";
        String text2 = "teachmeskills@gmail.com 1423-1512-51";
        String text3 = "1423-1512-51 +375294561234";
        String text4 = "teachmeskills@gmail.com +375294561234";

        Pattern pattern = Pattern.compile("[+[\\d]{12}]");
        Matcher matcher = pattern.matcher(text1);
        //[[A-z]@[a-z].[a-z]]
        //[[A-z]{1,}@[a-z]{1,}.[a-z]{1,}][+[\d]{12}]
        //[[\d{4}\-\d{4}-]\d{2}]
        while (matcher.find()){
            System.out.print(matcher.group());
        }
        System.out.println();
        matcher = pattern.matcher(text2);
        while (matcher.find()){
            System.out.print(matcher.group());
        }
        System.out.println();
        matcher = pattern.matcher(text3);
        while (matcher.find()){
            System.out.print(matcher.group());
        }
        matcher = pattern.matcher(text4);
        while (matcher.find()){
            System.out.print(matcher.group());
        }
    }
}
