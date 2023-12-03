package Homework16.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
        //строка является ключом, и ее значение равно true, если эта строка встречается в массиве
        //2 или более раз. Пример:
        //wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
        //wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
        //wordMultiple(["c", "c", "c", "c"]) → {"c": true}
        HashMap<String, Boolean> map = new HashMap<>();
        String[] letters = {"a", "b", "c", "a", "c"};
        Arrays.sort(letters);
        for(int i = 0; i < letters.length - 1; i++){
            if(Objects.equals(letters[i], letters[i + 1])){
                map.put(letters[i+1], true);
            } else {
                map.put(letters[i+1], false);
            }
        }
        System.out.println(map);
    }
}
