package org.academiadecodigo.bootcamp11.WordsRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by codecadet on 17/10/17.
 */
public class WordReader implements Iterable<String> {

    private String[] words;
    private String[] lines;


    private String readFileByLine(String file) throws IOException {

        BufferedReader bReader = new BufferedReader(new FileReader(file));

        String line = "";
        String result = "";

        while ((line = bReader.readLine()) != null) {
            result += line + "\n";
        }

        bReader.close();

        lines = result.split("\n");
        words = result.split(" ");


        return result;
    }

    @Override
    public Iterator<String> iterator() {

        return new Iterator<String>() {

            private Integer currentPos = -1;

            @Override
            public boolean hasNext() {
                if (currentPos < words.length) {
                    return true;
                }
                return false;
            }

            @Override
            public String next() {
                if (hasNext()) {
                    currentPos++;
                    return words[currentPos];
                }
                return null;
            }
        };
    }

    public static void main(String[] args) throws IOException {

        WordReader wordReader = new WordReader();

        wordReader.readFileByLine("resources/txt");
        for (String a : wordReader.lines) {
            System.out.println(a);

        }
        for (String b:wordReader.words) {
            System.out.println(b);

        }

    }

}
