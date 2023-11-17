package Homework13.task2;

public class Main {
    public static void main(String[] args) {
        try{
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            System.exit(0);
        } finally {
            System.out.println("Didnt happen");
        }
    }
}
