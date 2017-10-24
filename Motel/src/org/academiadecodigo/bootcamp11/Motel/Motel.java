package org.academiadecodigo.bootcamp11.Motel;

/**
 * Created by codecadet on 23/09/17.
 */
public class Motel {
    private String name;
    private Room[] rooms;


    public Motel(String name, int maxRoom) {
        this.name = name;
        this.rooms = new Room[maxRoom];
        for (int i = 0; i <rooms.length; i++){
            rooms[i] = new Room();
        }
    }

    public Room[] getRooms(){
        return rooms;
    }


    public String getName() {
        return name;
    }

    public int checkIn(Client room) {
        int roomNumber = -1;
        for (int i = 0; i < rooms.length; i++) {

            if (!rooms[i].isOcupiede()) {
                roomNumber = i;
                rooms[i].setOcupiede(true);
                System.out.println("The room " + roomNumber + " is free");
                room.setRoom(roomNumber);
                break;
            }

        }
        if (roomNumber == -1) {
            System.out.println("there are no rooms available");
        }

        return roomNumber;
    }

    public void checkOut(Client room) {
        for (int i = 0; i < rooms.length; i++) {

            if (rooms[room.getRoom()].isOcupiede()){
                rooms[room.getRoom()].setOcupiede(false);
                System.out.println("The client of the room " + room.getRoom() + " have checking out");
                break;

            }
        }
    }
}
