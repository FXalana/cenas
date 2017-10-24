package org.academiadecodigo.bootcamp11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by codecadet on 23/10/17.
 */
public class Server {
    public static void main(String[] args) throws IOException {


        int portNumber = Integer.parseInt("9234");
        String clientSentece;

        while (true) {

            ServerSocket serverSocket = new ServerSocket(portNumber);
            Socket clientSocket = serverSocket.accept();

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            clientSentece = in.readLine();
            System.out.println(clientSentece);

            in.close();
            out.close();
            serverSocket.close();
            clientSocket.close();

        }
    }
}
