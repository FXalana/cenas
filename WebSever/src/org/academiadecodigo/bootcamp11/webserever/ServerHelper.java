package org.academiadecodigo.bootcamp11.webserever;

import java.io.*;
import java.net.Socket;

/**
 * Created by codecadet on 27/10/17.
 */
public class ServerHelper implements Runnable {

    private Socket socketClient;
    private BufferedReader bufferedReader;
    private BufferedOutputStream bufferedOutputStream;
    private String[] req;


    public ServerHelper(Socket socketClient) {
        this.socketClient = socketClient;

    }


    private void creatStreams() throws IOException {
        bufferedReader = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
        bufferedOutputStream = new BufferedOutputStream(socketClient.getOutputStream());

    }


    private String readLine() throws IOException {
        String request = bufferedReader.readLine();
        this.req = request.split(" ");

        if (request == null || request.isEmpty()) {
            return null;
        }

        if (!req[0].equals("GET")) {
            return "resorces/405.html";
        }

        return "resorces/" + req[1];
    }


    private boolean checkResource(String resource) {
        File file = new File(resource);
        return file.exists() && file.isFile();

    }


    public String header(int statusCode, String contentType, long length) {

        String header = "HTTP/1.0 " + statusCode + " Document Follows\r\n" +
                "Content-Type: " + contentType + "; charset=UTF-8\r\n" +
                "Content-length: " + length + " \r\n" +
                "\r\n";

        return header;

    }


    private String typeOfFile() {
        String[] type = req[1].split(".");
        if (type.equals("html")) {
            String file = "resorces/index";
            return header(200, "html", file.length()) + file;

        }
        if (type.equals("jpg")) {
            String file = "resorces/NewProject.jpg";
            return header(200,"jpg",file.length()) +file;

        }
        return "resorces/404.html";

    }


    private void closeSoket() {
        try {
            socketClient.close();

        } catch (IOException a) {
            a.printStackTrace();

        }
    }


    @Override
    public void run() {
        try {
            creatStreams();
            String resource = readLine();
            if (resource == null) {
                return;

            }

            boolean exist = checkResource(resource);
            if (exist) {
               bufferedOutputStream.write(typeOfFile().getBytes());

            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            closeSoket();

        }

    }
}
