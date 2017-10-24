package org.academiadecodigo.bootcamp11.ArabiansNightss;

/**
 * Created by codecadet on 25/09/17.
 */
public class FrendlyGenie extends Genie {


    public FrendlyGenie(int wish) {
        super(wish);
    }

    @Override
    public void grantsWish() {
        if (getWishes() != 0) {
            super.grantsWish();
        }

    }
}
