package org.academiadecodigo.bootcamp11.webserever;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by codecadet on 24/10/17.
 */
public class Server {

    public String header(int statusCode, String contentType, long length) {

        String header = "HTTP/1.0 " + statusCode + " Document Follows\r\n" +
                "Content-Type: " + contentType + "; charset=UTF-8\r\n" +
                "Content-length: " + length + " \r\n" +
                "\r\n";

        return header;
    }

    public static void main(String[] args) throws IOException {

        Server server = new Server();
        int portNumber = Integer.parseInt("9876");


        ServerSocket serverSocket = new ServerSocket(portNumber);
        Socket clientSocket = serverSocket.accept();

        ServerHelper serverHelper = new ServerHelper(clientSocket);

        Thread thread = new Thread(serverHelper);
        thread.start();
















            System.out.println("in the 405");
            File erroFile405 = new File("resorces/405.html");

            FileInputStream fileInputStream = new FileInputStream(erroFile405);

            String erro405 = server.header(405, "text/html", erroFile405.length());

            byte[] buffer = new byte[1024];

            bufferedOutputStream.write(erro405.getBytes());

            int length;
            while ((length = fileInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, length);
            }
            bufferedOutputStream.flush();
        }


        File file = new File("resorces/NewProject.jpg");
        System.out.println(file.exists());
        if (!file.exists()) {

            System.out.println("in the 404");
            System.out.println(req[1]);

            File erroFile404 = new File("resorces/404.html");

            FileInputStream fileInputStream = new FileInputStream(erroFile404);

            String erro404 = server.header(404, "text/html", erroFile404.length());
            System.out.println(erro404);

            byte[] buffer = new byte[1024];

            bufferedOutputStream.write(erro404.getBytes());

            int length;
            while ((length = fileInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, length);
            }
            bufferedOutputStream.flush();

        } else {

            System.out.println("200");
            System.out.println(file.exists());

            FileInputStream fileInputStream = new FileInputStream(file);

            String index = server.header(200, "image/jpeg", file.length());
            System.out.println("index: " + index);

            byte[] buffer = new byte[1024];

            int length;
            bufferedOutputStream.write(index.getBytes());
            while ((length = fileInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, length);

            }
            bufferedOutputStream.flush();

            System.out.println(request);
            bufferedOutputStream.close();
            buffered.close();
            serverSocket.close();

        }
    }

