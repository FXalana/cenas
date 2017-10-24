package org.academiadecodigo.bootcamp11.copying;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by codecadet on 17/10/17.
 */
public class Copying {

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("resources/batata.jpg");
        FileOutputStream outputStream = new FileOutputStream("resources/batat.jpg");

        int b = inputStream.read();
        while (b != -1) {
            outputStream.write(b);
            inputStream.read();
        }
        inputStream.close();
        outputStream.close();
    }


}
