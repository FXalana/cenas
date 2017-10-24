package org.academiadecodigo.carcrash.field;

public class Position {

    private int col;
    private int row;

    public Position(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return this.col;
    }

    public int getRow() {
        return this.row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void right(int speed) {
        this.setCol(this.getCol() + speed);
    }

    public void left(int speed) {
        this.setCol(this.getCol() - speed);
    }

    public void up(int speed) {
        this.setRow(this.getRow() - speed);
    }

    public void down(int speed) {
        this.setRow(this.getRow() + speed);
    }


    public boolean equals(Position pos) {
        return this.col == pos.getCol() && this.row == pos.getRow();
    }
}