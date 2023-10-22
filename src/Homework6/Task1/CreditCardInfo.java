package Homework6.Task1;

public class CreditCardInfo {
    String accountNumber;
    int moneyAmount;

    public CreditCardInfo(String accountNumber, int moneyAmount) {
        this.accountNumber = accountNumber;
        this.moneyAmount = moneyAmount;
    }

    void makeMoney(CreditCardInfo card, int salary){
        card.moneyAmount = card.moneyAmount + salary;
    }
    void loseMoney(CreditCardInfo card, int fine){
        card.moneyAmount = card.moneyAmount - fine;
    }

    void showCardInfo(CreditCardInfo card){
        System.out.println("Номер карточки: " + card.accountNumber + " Денег на счету: " + card.moneyAmount);
    }
}
