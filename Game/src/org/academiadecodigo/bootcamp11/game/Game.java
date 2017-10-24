package org.academiadecodigo.bootcamp11.game;

/**
 * Created by codecadet on 19/09/17.
 */
public class Game {
    private int maxNumber;
    Player[] players;

    public Game(int maxNumber, Player[] players) {
        this.maxNumber = maxNumber;
        this.players = players;
    }

    public int chooseNumber(int max) {
        return NunberGenerator.getNumber(max);

    }

    public void start() {

        for (int i = 0; i < players.length; i++) {

            if (chooseNumber(maxNumber) != players[i].guessNumber(maxNumber)) {

                System.out.println("Try again " + players[i].getName());

                if (i == players.length - 1) {
                    i = -1;
                }

                continue;
            }

            System.out.println("Corret number." + players[i].getName() + " WIN");
            break;

        }
    }
}
