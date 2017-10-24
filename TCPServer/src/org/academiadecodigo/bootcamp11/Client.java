package org.academiadecodigo.bootcamp11;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by codecadet on 23/10/17.
 */
public class Client {
    public static void main(String[] args) throws IOException {

        boolean run = true;

        String sentence;
        Scanner scanner = new Scanner(System.in);

        while (run) {

            sentence = scanner.nextLine();

            Socket clientSocket = new Socket("localhost", 9234);

            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

            outToServer.writeBytes(sentence);

            outToServer.close();
            clientSocket.close();

            if (sentence.equals("/quit")){
                run = false;
            }
        }
    }
}