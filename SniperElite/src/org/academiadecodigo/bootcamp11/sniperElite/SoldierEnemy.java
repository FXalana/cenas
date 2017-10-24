package org.academiadecodigo.bootcamp11.sniperElite;

/**
 * Created by codecadet on 29/09/17.
 */
public class SoldierEnemy extends Enemy {


    public SoldierEnemy(int health) {
        super(health);
    }

    @Override
    public void hit(int damage) {
        if (getHealth() > 0) {
            setHealth(getHealth() - damage);
            System.out.println("You have hit a enemy, and he still have " + getHealth());
            return;
        }
        if (getHealth() == 0) {
            setHealth(damage);
            setDead(true);
            System.out.println("You have kill a enemy");
            return;
        }


    }
}
