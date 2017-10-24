package org.academiadecodigo.bootcamp11.paint;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 21/10/17.
 */
public class Cell {

    private int row;
    private int col;
    private Rectangle cell;


    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cell = cell();
        cell().draw();
    }


    public void paint(){
        cell.fill();
    }


    public Rectangle cell() {
        Rectangle cell = new Rectangle(row*Grid.CELLSIZE+Grid.PADDING, col*Grid.CELLSIZE+Grid.PADDING,
                Grid.getCELLSIZE(), Grid.getCELLSIZE());
        cell.setColor(Color.BLACK);
        cell.draw();
        return cell;
    }


    public int getCol() {
        return col;
    }


    public int getRow() {
        return row;
    }


}
