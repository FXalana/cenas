package org.academiadecodigo.bootcamp11.RockPaperScissors;

/**
 * Created by codecadet on 21/09/17.
 */
public class Game {
    private int rounds;
    private Player playerOne;
    private Player playerTwo;
    private int maxRouds;


    public Game(Player playerOne, Player playerTwo, int maxRouds) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.maxRouds = maxRouds;
        rounds = 0;
    }


    public void start() {


        while (rounds != maxRouds) {

            Hand handPlayer1 = playerOne.chooseHand();
            Hand handPlayer2 = playerTwo.chooseHand();

            if (handPlayer1 == handPlayer2) {
                System.out.println("It's a tie");
                continue;
            }
            if (handPlayer1 == Hand.Rock && handPlayer2 == Hand.Scissors) {
                System.out.println(playerOne.getName() + " have won this round.");
                rounds++;
                playerOne.winRound();
                continue;
            }
            if (handPlayer1 == Hand.Scissors && handPlayer2 == Hand.Paper) {
                System.out.println(playerOne.getName() + " have won this round.");
                rounds++;
                playerOne.winRound();
                continue;
            }
            if (handPlayer1 == Hand.Paper && handPlayer2 == Hand.Rock) {
                System.out.println(playerOne.getName() + " have won this round.");
                rounds++;
                playerOne.winRound();
                continue;
            }
            if (handPlayer2 == Hand.Rock && handPlayer1 == Hand.Scissors) {
                System.out.println(playerTwo.getName() + " have won this round.");
                rounds++;
                playerTwo.winRound();
                continue;
            }
            if (handPlayer2 == Hand.Scissors && handPlayer1 == Hand.Paper) {
                System.out.println(playerTwo.getName() + " have won this round.");
                rounds++;
                playerTwo.winRound();
                continue;
            }
            if (handPlayer2 == Hand.Paper && handPlayer1 == Hand.Rock) {
                System.out.println(playerTwo.getName() + " have won this round.");
                rounds++;
                playerTwo.winRound();


            }

        }
        if (playerOne.getWins() > playerTwo.getWins()) {

            System.out.println(playerOne.getName() + " have won.");
            return;
        }
        System.out.println(playerTwo.getName() + " have won.");
    }
}
