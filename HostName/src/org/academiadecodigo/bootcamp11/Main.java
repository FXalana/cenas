package org.academiadecodigo.bootcamp11;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by codecadet on 23/10/17.
 */
public class Main {
    public static void main(String[] args) {


        try {
            System.out.println(InetAddress.getByName("google.com").isReachable(1000));
            System.out.println(InetAddress.getLocalHost());
            System.out.println(InetAddress.getByName("www.Google.com"));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
