package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

abstract public class Car {

    /**
     * The position of the car on the grid
     */

    private Position pos;
    private boolean crashed;
    private int speed;


    public Car(Position pos, int speed) {
        this.pos = pos;
        this.speed = speed;



    }

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return this.crashed;
    }

    public void setCrashed(boolean crashed) {
        this.crashed = crashed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void moveCar(int position) {
        switch (position) {
            case 0:
                if (pos.getCol() + speed >= Field.width) {
                    moveCar(1);
                    break;
                }
                pos.right(speed);
                break;
            case 1:
                if (pos.getCol() - speed < 0) {
                    moveCar(0);
                    break;
                }
                pos.left(speed);
                break;
            case 2:
                if (pos.getRow() + speed >= Field.height) {
                    moveCar(3);
                    break;
                }
                pos.down(speed);
                break;
            case 3:
                if (pos.getRow() - speed < 0) {
                    moveCar(2);
                    break;
                }
                pos.up(speed);
                break;
            default:
                speed = 0;
                System.out.println("You can't move that way");
        }

    }


}
