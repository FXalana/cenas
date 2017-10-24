package org.academiadecodigo.bootcamp11.sniperElite;

/**
 * Created by codecadet on 29/09/17.
 */
abstract public class Enemy extends GameObject {
    private int health;
    private boolean dead;

    public Enemy(int health) {
        this.health = health;
    }

    public boolean isDead() {
        return dead;
    }
    public void setDead(boolean dead){
        this.dead = dead;
    }
    public int getHealth(){
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    abstract public void hit(int damage);

    @Override
    public String getMessage() {
        System.out.println("I'm going to kill you");
        return null;
    }
}
