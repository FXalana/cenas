package org.academiadecodigo.bootcamp11.ArabiansNightss;

/**
 * Created by codecadet on 25/09/17.
 */
public class Main {
    public static void main(String[] args) {

        MagicLamp magicLamp = new MagicLamp(3,3);

        Genie genie = magicLamp.rubLamp();
        Genie genie1 = magicLamp.rubLamp();
        Genie genie2 = magicLamp.rubLamp();
        Genie genie3 = magicLamp.rubLamp();

        genie.grantsWish();
        genie1.grantsWish();
        genie2.grantsWish();
        genie3.grantsWish();

        magicLamp.recycleDemon(genie2);



    }


}
