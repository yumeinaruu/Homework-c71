package Homework7.Task2.without_static;

import java.util.Objects;

public class Dog {
    private String food;
    private Dog(String food){
        this.food = food;
    }

    public static Dog makeObject(String food){
        Dog dog = new Dog(food);
        return dog;
    }

    public void voice() {
        System.out.println("Bark Bark Bark");
    }

    public void eat() {
        if(Objects.equals(this.food, "Grass") || Objects.equals(this.food, "grass")){
            System.out.println("Its not that good, but its ok");
        } else if(Objects.equals(this.food, "Meat") || Objects.equals(this.food, "meat")){
            System.out.println("Yes, I like it");
        } else{
            System.out.println("I like only meat");
        }
    }
}
