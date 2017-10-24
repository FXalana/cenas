package org.academiadecodigo.bootcamp11.game;

/**
 * Created by codecadet on 19/09/17.
 */
public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int guessNumber(int max) {

        return NunberGenerator.getNumber(max);
    }


}

