package Homework16.task2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //На вход поступает массив непустых строк, создайте и верните Map<String,
        //String> следующим образом: для каждой строки добавьте ее первый символ в
        //качестве ключа с последним символом в качестве значения. Пример:
        //pairs(["code", "bug"]) → {"b": "g", "c": "e"}
        //pairs(["man", "moon", "main"]) → {"m": "n"}
        //pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"
        String[] words = {"moon", "man", "good", "bug"};
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            char[] letters = words[i].toCharArray();
            map.put(String.valueOf(letters[0]), String.valueOf(letters[letters.length - 1]));
        }
        System.out.println(map);
    }
}
