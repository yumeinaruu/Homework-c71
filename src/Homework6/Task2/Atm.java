package Homework6.Task2;

public class Atm {
    int banknote20;
    int banknote50;
    int banknote100;
    int totalAmountOfMoney;

    Atm(int banknote20, int banknote50, int banknote100){
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
        totalAmountOfMoney = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
    }
    void addMoneyToAtm(Atm atm, int money){
        atm.totalAmountOfMoney = atm.totalAmountOfMoney + money;
    }
    boolean getMoneyFromAtm(int money){
        if(money > totalAmountOfMoney){
            return false;
        }
        totalAmountOfMoney = totalAmountOfMoney - money;
        return true;
    }
}
