package org.academiadecodigo.bootcamp11.paint;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 18/10/17.
 */
public class Grid {

    private int row;
    private int col;
    private int width;
    private int height;
    private Pointer pointer;
    private Cell[][] cells;

    public static final int PADDING = 10;
    public static final int CELLSIZE = 20;

    public Grid(int row, int col) {
        this.row = row;
        this.col = col;
        this.pointer = new Pointer();
        this.cells = new Cell[col][row];

    }


    public void gridCells() {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                Cell cell = new Cell(i, j);
                cells[i][j] = cell;
            }
        }
    }


    public void init() {
        Rectangle rectangle = new Rectangle(PADDING, PADDING, getWidth(), getHeight());
        rectangle.setColor(Color.BLACK);
        rectangle.draw();
        gridCells();
    }


    public void paint(){

        cells[pointer.getCol()][pointer.getRow()].paint();
    }


    public int getHeight() {
        return row * CELLSIZE;
    }


    public int getWidth() {
        return col * CELLSIZE;
    }


    public static int getCELLSIZE() {
        return CELLSIZE;
    }


    public static int getPADDING() {
        return PADDING;
    }


}

