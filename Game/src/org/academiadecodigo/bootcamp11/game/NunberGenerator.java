package org.academiadecodigo.bootcamp11.game;

/**
 * Created by codecadet on 19/09/17.
 */
public class NunberGenerator {

    public static int getNumber(int maxNumber) {
        return (int) (Math.random() * (maxNumber + 1));


    }

}
