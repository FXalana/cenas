package org.academiadecodigo.bootcamp11.paint;

import java.io.IOException;

/**
 * Created by codecadet on 18/10/17.
 */
public class Main {

    public static void main(String[] args) {

        Grid grid = new Grid(15, 15);
        grid.init();

        Save save = new Save();

        try {
            save.writeFileByLine("resorces/saves", "cenas");
            save.readFileByLine("resorces/saves");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
