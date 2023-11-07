package Homework10.Task1;

public class Main {
    public static void main(String[] args) {
        User subject1 = new User("Anatoly", 18);
        User subject2 = new User("Arseniy", 19);
        System.out.println(subject2);
        System.out.println(subject1.equals(subject2));
        subject2.setUserName("Anatoly");
        subject2.setUserAge(18);
        System.out.println(subject2);
        System.out.println(subject1.equals(subject2));
    }
}
