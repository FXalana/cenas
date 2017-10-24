package org.academiadecodigo.bootcamp11.Motel;

/**
 * Created by codecadet on 23/09/17.
 */
public class Main {
    public static void main(String[] args) {
        Motel motel = new Motel("Motel Maria", 5);
        Client client = new Client("Tó");
        Client client1 = new Client("Zé");



        //client.askForRoom();
        motel.checkIn(client);
        motel.checkIn(client1);
        motel.checkOut(client1);
        motel.checkOut(client);


    }
}
