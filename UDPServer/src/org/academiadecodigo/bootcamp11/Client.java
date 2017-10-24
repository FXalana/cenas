package org.academiadecodigo.bootcamp11;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * Created by codecadet on 23/10/17.
 */
public class Client {
    public static void main(String[] args) throws IOException {


        int portN = Integer.parseInt("8090");
        Scanner scanner = new Scanner(System.in);

        DatagramSocket socket = new DatagramSocket(portN);

        byte[] sendBuffer;
        byte[] recvBuffer = new byte[1024];

        String data = scanner.nextLine();
        sendBuffer = data.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length,
                InetAddress.getLocalHost(), 8080);
        socket.send(sendPacket);

        DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
        socket.receive(receivePacket);

        String s = new String(receivePacket.getData());
        s = s.replaceAll("\u0000","");

        System.out.println(s);
        socket.close();
    }
}
