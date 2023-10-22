package Homework6.Task1;

import java.util.Scanner;

public class CreditCardMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCardInfo card1 = new CreditCardInfo("4035 0460 7364 2054", 1200);
        CreditCardInfo card2 = new CreditCardInfo("4300 7913 7705 0342", 500);
        CreditCardInfo card3 = new CreditCardInfo("4548 0647 7778 0286", 800);
        System.out.println("Сколько вы хотите положить денег на первую карту?");
        card1.makeMoney(card1, scanner.nextInt());
        System.out.println("Сколько вы хотите положить денег на вторую карту?");
        card1.makeMoney(card2, scanner.nextInt());
        System.out.println("Сколько вы хотите снять денег с третьей карты?");
        card1.loseMoney(card3, scanner.nextInt());
        card1.showCardInfo(card1);
        card2.showCardInfo(card2);
        card3.showCardInfo(card3);
    }
}
