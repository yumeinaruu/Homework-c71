package Homework15.task1;

import java.util.HashSet;
import java.util.Scanner;

public class MainString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < text.length; i++){
            set.add(text[i]);
        }
        System.out.println(set);
    }
}