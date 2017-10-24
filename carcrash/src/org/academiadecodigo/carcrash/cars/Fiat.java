package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

/**
 * Created by codecadet on 27/09/17.
 */
public class Fiat extends Car {

    public Fiat(Position pos, int speed) {
        super(pos, speed);
    }


    @Override
    public String toString() {
        return "F";
    }

}
