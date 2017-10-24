package org.academiadecodigo.bootcap11.carstand;

import org.academiadecodigo.bootcap11.carstand.specs.*;

/**
 * Created by codecadet on 18/10/17.
 */
public class Main {
    public static void main(String[] args) {

        Car Xalana = new BasicCar();
        Xalana = new GPS(Xalana);
        Xalana = new AC(Xalana);

        Car Francisco = new Turbo(new GPS(new AC(new Leather(new SoundSystem(new BasicCar())))));

        System.out.println("Francisco " + Francisco.getPrice() + "€");
        System.out.println("Xalana " + Xalana.getPrice() + "€");

    }
}
