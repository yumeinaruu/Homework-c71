package Homework8.Task1;

import java.util.Objects;

public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("Pi pi pi");
    }

    @Override
    public void eat(String food) {
        if(Objects.equals(food, "Grass") || Objects.equals(food, "grass")){
            System.out.println("Yes i like it");
        } else if(Objects.equals(food, "Meat") || Objects.equals(food, "meat")){
            System.out.println("fooooo");
        } else{
            System.out.println("I like only grass");
        }
    }
}
