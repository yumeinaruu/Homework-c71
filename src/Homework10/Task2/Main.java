package Homework10.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        while (true) {
            System.out.println("For deep clone use 1\nFor just clone use 2");
            User userClone = (User) user.clone(scanner.nextInt());
            user.setId(2);
            user.person.setAge(19);
            user.person.setName("Arseniy");
            System.out.println(user);
            System.out.println(userClone);
            System.out.println("If you want to exit press 1");
            if(scanner.nextInt()==1){
                System.exit(0);
            }
        }
    }
}
