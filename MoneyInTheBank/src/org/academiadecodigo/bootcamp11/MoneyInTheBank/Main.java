package org.academiadecodigo.bootcamp11.MoneyInTheBank;

/**
 * Created by codecadet on 22/09/17.
 */
public class Main {
    public static void main(String[] args) {

        Piggybank shitToPutMoney = new Piggybank(500);
        Wallet wallet = new Wallet(100);
        Person person = new Person("Zé",shitToPutMoney,wallet);

        person.depositMoney(5);
        person.withdrawMoney(5);


    }
}
