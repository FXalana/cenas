package org.academiadecodigo.bootcamp11.urlsource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by codecadet on 24/10/17.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scaner = new Scanner(System.in);
        String urlSpec = null;
        urlSpec = scaner.next();

        URL url = new URL("http://" + urlSpec);

        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        while ( (inputLine = in.readLine()) != null){
            System.out.println(inputLine);
        }

    }
}
