package Homework7.Task1;

import java.util.Objects;

public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("Bark Bark Bark");
    }

    @Override
    public void eat(String food) {
        if(Objects.equals(food, "Grass") || Objects.equals(food, "grass")){
            System.out.println("Its not that good, but its ok");
        } else if(Objects.equals(food, "Meat") || Objects.equals(food, "meat")){
            System.out.println("Yes, I like it");
        } else{
            System.out.println("I like only meat");
        }
    }
}
