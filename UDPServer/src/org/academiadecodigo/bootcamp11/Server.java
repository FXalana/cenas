package org.academiadecodigo.bootcamp11;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by codecadet on 23/10/17.
 */
public class Server {
    public static void main(String[] args) throws IOException {

        DatagramSocket serverSocket = new DatagramSocket(8080);

        byte[] sendBuffer;
        byte[] recvBuffer = new byte[1024];

        while (true){

            DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);

            serverSocket.receive(receivePacket);
            String data = new String(receivePacket.getData());


            String upData = data.toUpperCase();

            sendBuffer = upData.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length,
                    receivePacket.getAddress(), receivePacket.getPort());
            serverSocket.send(sendPacket);

        }
    }
}
