package org.academiadecodigo.bootcamp11.RockPaperScissors;

/**
 * Created by codecadet on 21/09/17.
 */
public class Main {
    public static void main(String[] args) {



        Player playerOne = new Player("Tó",0);
        Player playerTwo = new Player("Zé",0);
        Game game = new Game(playerOne, playerTwo, 3);


        game.start();
        {

        }
    }
}
