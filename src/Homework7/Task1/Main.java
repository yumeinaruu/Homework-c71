package Homework7.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the type of cure plan (int number)");
            Patient patient = new Patient(scanner.nextInt());
            patient.curing();
            System.out.println("If you want to end curing, press 1");
            if(scanner.nextInt() == 1){
                break;
            }
        }
    }
}
