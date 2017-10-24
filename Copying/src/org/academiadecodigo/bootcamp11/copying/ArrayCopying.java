package org.academiadecodigo.bootcamp11.copying;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by codecadet on 17/10/17.
 */
public class ArrayCopying {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("resources/batata.jpg");
        FileOutputStream outputStream = new FileOutputStream("resources/batatta.jpg");

        byte[] b = new byte[5];
        int num = inputStream.read(b);

        while (num != -1) {
            outputStream.write(b);
            inputStream.read(b);
        }
        inputStream.close();
        outputStream.close();
    }

}

