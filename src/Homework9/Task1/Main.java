package Homework9.Task1;

public class Main {
    public static void main(String[] args) {
        Postable director = new Director();
        Postable accountant = new Accountant();
        Postable worker = new Worker();
        director.postName();
        accountant.postName();
        worker.postName();
    }
}
