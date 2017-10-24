package org.academiadecodigo.bootcamp11.ArabiansNightss;

/**
 * Created by codecadet on 25/09/17.
 */
public class RecyclableDemon extends Genie {

    private boolean recycled;

    public RecyclableDemon(int wish) {
        super(wish);

    }

    @Override
    public void grantsWish (){
        if (recycled) {
             return;
        }
        super.grantsWish();
    }

    public void recycled(){
        recycled=true;
    }
    public boolean getRecycled(){
       return this.recycled;
    }

}
