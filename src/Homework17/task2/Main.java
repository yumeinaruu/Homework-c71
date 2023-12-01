package Homework17.task2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //Используя Predicate среди массива чисел вывести только те, которые являются
        //положительными.
        int[] numbers = {-1, 2, 3, -9, 5, 0};
        Predicate<Integer> predicate = (num) -> {
              if(num > 0){
                  return true;
              }
            return false;
        };
        for(int i = 0; i < numbers.length; i++){
            if(predicate.test(numbers[i])){
                System.out.println(numbers[i]);
            }
        }
    }
}
