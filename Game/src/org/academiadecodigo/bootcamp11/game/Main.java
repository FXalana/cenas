package org.academiadecodigo.bootcamp11.game;

/**
 * Created by codecadet on 19/09/17.
 */
public class Main {


    public static void main(String[] args) {

        Player[] players = {
                new Player("Tó Zé"),
                new Player("Tó"),
                new Player("Zé Tó"),
                new Player("Zé")

        };


        Game game = new Game(10, players);

        game.start();

    }
}

