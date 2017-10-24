package org.academiadecodigo.bootcamp11.ArabiansNightss;

/**
 * Created by codecadet on 25/09/17.
 */
public class Genie {

    private int wishes;

    public Genie(int maxWishes) {

    }

    public void grantsWish() {
        wishes--;
        System.out.println("Wish granted");
    }

    public int getWishes() {
        return this.wishes;
    }
}


