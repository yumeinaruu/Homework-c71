package Homework18.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Задача 1:
        //Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
        //Stream'ов:
        //- Удалить дубликаты
        //- Оставить только четные элементы
        //- Вывести сумму оставшихся элементов в стриме
        Random random = new Random();
        List<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            arrayList.add(random.nextInt(1, 100));
        }
        System.out.println(arrayList);
        int sum = arrayList.stream().distinct().filter(a -> a % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
