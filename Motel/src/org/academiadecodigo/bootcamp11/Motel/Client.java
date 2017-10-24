package org.academiadecodigo.bootcamp11.Motel;

/**
 * Created by codecadet on 23/09/17.
 */
public class Client {
    private String name;
    private Motel motel;
    private int room;

    public Client (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Motel getMotel() {
        return motel;
    }

    public int getRoom() {
        return room;
    }

    public void setMotel(Motel name){
        this.motel = name;
    }

    public void setRoom(int room){
        this.room = room;
    }

   // public void askForRoom(){
     //   motel.checkIn();

    //}
}
