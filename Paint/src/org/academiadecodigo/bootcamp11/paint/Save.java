package org.academiadecodigo.bootcamp11.paint;

import java.io.*;

/**
 * Created by codecadet on 18/10/17.
 */
public class Save {

    public String readFileByLine(String file) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line = "";
        String result = "";

        while ((line = bufferedReader.readLine()) != null) {
            result += line + "\n";
        }

        bufferedReader.close();

        return result;
    }


    public String writeFileByLine(String file, String text) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        bufferedWriter.write(text);

        bufferedWriter.flush();
        bufferedWriter.close();

        return file;
    }


}
