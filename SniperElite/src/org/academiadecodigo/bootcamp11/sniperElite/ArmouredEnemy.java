package org.academiadecodigo.bootcamp11.sniperElite;

/**
 * Created by codecadet on 29/09/17.
 */
public class ArmouredEnemy extends Enemy {

    private int armor;


    public ArmouredEnemy(int health, int armor) {
        super(health);
        this.armor=armor;

    }

    @Override
    public void hit(int damage) {
        if (armor > 0) {
            armor -= damage;
            System.out.println("The armor enemy had lost " + damage + " armor and still have  " + armor  +" armor");
            return;

        }
        if (getHealth() > 0) {
            setHealth(getHealth() - damage);
            System.out.println("The armor enemy had lost " + getHealth() + " HP and still have " + getHealth() + " HP");
            return;

        }
        if (getHealth() <= 0) {
            setHealth(damage);
            setDead(true);
            System.out.println("You have kill a armor enemy");
            return;
        }


    }
}
