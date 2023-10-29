package Homework8.Task1;

import java.util.Objects;

public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("Rawr Rawr Rawr");
    }

    @Override
    public void eat(String food) {
        if(Objects.equals(food, "Grass") || Objects.equals(food, "grass")){
            System.out.println("I dont like it");
        } else if(Objects.equals(food, "Meat") || Objects.equals(food, "meat")){
            System.out.println("Yes, I like it");
        } else{
            System.out.println("I like only meat");
        }
    }
}
