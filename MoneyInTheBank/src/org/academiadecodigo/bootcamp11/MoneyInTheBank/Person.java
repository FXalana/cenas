package org.academiadecodigo.bootcamp11.MoneyInTheBank;

/**
 * Created by codecadet on 22/09/17.
 */
public class Person {
    private String name;
    private Piggybank shitToPutMoney;
    private Wallet poket;

    public Person(String name, Piggybank shitToPutMoney, Wallet poket){
        this.name = name;
        this.shitToPutMoney = shitToPutMoney;
        this.poket = poket;

    }

    public void depositMoney(int money){
        if (money < 0){
            money = 0;
        }
        poket.withdraw(money);
        shitToPutMoney.addMoney(money);
        System.out.println("You have deposit " + money + "€");
        System.out.println("You have "+ shitToPutMoney.getMoney() + "€ in the piggy bank" );
        System.out.println("you have " + poket.getMoney() + "€ in your wallet");

    }

    public void withdrawMoney(int money){
        if (money < 0){
            money = 0;
        }
        shitToPutMoney.withdraw(money);
        poket.addMoney(money);
        System.out.println("You have withdraw " + money + "€");
        System.out.println("you have " + poket.getMoney() + "€ in your wallet");
        System.out.println("You have "+ shitToPutMoney.getMoney() + "€ in the piggy bank" );

    }


}
