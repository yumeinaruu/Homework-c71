package Homework7.Task2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple = new Apple();
        final Field field = Homework7.Task2.Apple.class.getDeclaredField("color");
        field.setAccessible(true);
        final Object color = field.get(Homework7.Task2.Apple.class);
        field.set(color, "Red");
        System.out.println(color);
    }
}
