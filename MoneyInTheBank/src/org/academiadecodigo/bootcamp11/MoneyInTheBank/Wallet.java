package org.academiadecodigo.bootcamp11.MoneyInTheBank;

/**
 * Created by codecadet on 22/09/17.
 */
public class Wallet {
    private int money;

    public Wallet(int money) {
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }

    public void addMoney(int money) {
        this.money += money;


    }

    public int withdraw(int money) {
        if (money > this.money) {
            money = this.money;


        }
        this.money -= money;
        return money;
    }


}
