package org.academiadecodigo.bootcamp11.RockPaperScissors;

/**
 * Created by codecadet on 21/09/17.
 */
public class Player {
    private String name;
    private int wins;

    private Hand hand;

    public Player(String name, int wins){
        this.name = name;
        this.wins = wins;
    }
    public Hand chooseHand(){
        int random = (int) (Math.random() * 3);
        Hand[] arrayHand = Hand.values();
        return arrayHand[random];
    }
    public String getName(){
        return name;

    }
    public int getWins(){
        return wins;

    }
    public void winRound(){
        wins++;

    }




}
