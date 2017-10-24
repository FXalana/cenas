package org.academiadecodigo.bootcamp11.ArabiansNightss;

/**
 * Created by codecadet on 25/09/17.
 */
public class MagicLamp {

    private int genieLeft;
    private int maxGenie;


    public MagicLamp(int genieLeft, int maxGenie) {
        this.genieLeft = genieLeft;
        this.maxGenie = maxGenie;

    }

    public Genie rubLamp() {
        genieLeft--;
        int number = (int) ((Math.random() * 10) + 1);
        if (genieLeft == 0) {
            System.out.println("Summon demon ");
            genieLeft = -1;
            return new RecyclableDemon(number);
        }
        if (number % 2 == 0 && genieLeft > 0) {
            System.out.println("summon frendly genie");
            return new FrendlyGenie(number);
        }
        if (number % 2 != 0 && genieLeft > 0)
        System.out.println("summon grumpy genie");
        return new GrumpyGenie(number);

    }
     public void recycleDemon(Genie recycle){
        if(recycle instanceof RecyclableDemon){
            RecyclableDemon demon = (RecyclableDemon) recycle;
            if (demon.getRecycled() == false ){
                genieLeft=maxGenie;
                System.out.println("You have recycle a demon");
                demon.recycled();
                return;
            }
            System.out.println("You can't recycle anymore demons");

        }
     }

}
