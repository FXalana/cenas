package org.academiadecodigo.bootcamp11.paint;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;;


/**
 * Created by codecadet on 18/10/17.
 */
public class Pointer implements KeyboardHandler {

    private Keyboard key;
    private Rectangle rectangle;
    private int row;
    private int col;
    private Grid grid;


    public Pointer() {
        configKeyboard();
        this.rectangle = new Rectangle(Grid.getPADDING(), Grid.getPADDING(), Grid.getCELLSIZE(), Grid.getCELLSIZE());
        rectangle.setColor(Color.BLUE);
        rectangle.fill();
    }


    public int getRow() {
        return row;
    }


    public int getCol() {
        return col;
    }


    public void configKeyboard() {

        this.key = new Keyboard(this);

        int[] kArray = {

                KeyboardEvent.KEY_UP,
                KeyboardEvent.KEY_LEFT,
                KeyboardEvent.KEY_DOWN,
                KeyboardEvent.KEY_RIGHT,
                KeyboardEvent.KEY_SPACE
        };

        for (int i : kArray) {

            KeyboardEvent k = new KeyboardEvent();
            k.setKey(i);
            k.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            key.addEventListener(k);

        }
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                rectangle.translate(-Grid.getCELLSIZE(), 0);
                row -= Grid.getCELLSIZE();
                break;
            case KeyboardEvent.KEY_RIGHT:
                rectangle.translate(Grid.getCELLSIZE(), 0);
                row += Grid.getCELLSIZE();
                break;
            case KeyboardEvent.KEY_UP:
                rectangle.translate(0, -Grid.getCELLSIZE());
                col -= Grid.CELLSIZE;
                break;
            case KeyboardEvent.KEY_DOWN:
                rectangle.translate(0, Grid.getCELLSIZE());
                col += Grid.CELLSIZE;
                break;
            case KeyboardEvent.KEY_SPACE:
                System.out.println(grid);
                grid.paint();
                break;
        }
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }


}
