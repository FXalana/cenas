package org.academiadecodigo.bootcamp11.sniperElite;

/**
 * Created by codecadet on 29/09/17.
 */
public class SniperRifle {

    private int bulletDamage;
    private int bullet;
    private int shoots;

    public SniperRifle(int bulletDamage, int bullet) {
        this.bulletDamage = bulletDamage;
        this.bullet = bullet;
    }

    public int getShoots() {
        return shoots;
    }

    public void shoot(Destroyble destroyble) {
        while (!destroyble.isDestroyed()){

            if (bullet > 0) {
                destroyble.hit(bulletDamage);
                System.out.println("You have shoot a enemy and you have ");
                bullet--;
                shoots ++;

            }

            if (bullet == 0) {
                System.out.println("You don't have bullets");
                return;
            }
        }
    }
}



