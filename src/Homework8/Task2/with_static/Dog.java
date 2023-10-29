package Homework8.Task2.with_static;

import java.util.Objects;

public class Dog {

    private Dog(){

    }
    public static void voice() {
        System.out.println("Bark Bark Bark");
    }

    public static void eat(String food) {
        if(Objects.equals(food, "Grass") || Objects.equals(food, "grass")){
            System.out.println("Its not that good, but its ok");
        } else if(Objects.equals(food, "Meat") || Objects.equals(food, "meat")){
            System.out.println("Yes, I like it");
        } else{
            System.out.println("I like only meat");
        }
    }
}
