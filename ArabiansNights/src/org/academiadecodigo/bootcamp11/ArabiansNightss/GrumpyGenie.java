package org.academiadecodigo.bootcamp11.ArabiansNightss;

/**
 * Created by codecadet on 25/09/17.
 */
public class GrumpyGenie extends Genie {

    private boolean grantedWish;

    public GrumpyGenie(int wishes) {
        super(wishes);
    }

    @Override
    public void grantsWish() {
        if (!grantedWish) {
            super.grantsWish();
            grantedWish = true;
        }
    }
}
