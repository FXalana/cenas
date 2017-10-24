package org.academiadecodigo.bootcamp11.sniperElite;

/**
 * Created by codecadet on 02/10/17.
 */
public class Barrel extends GameObject implements Destroyble {

    private BarrelType barrelType;
    private int currentDamage;
    private boolean destroyed;

    public Barrel(BarrelType barrelType) {
        this.barrelType = barrelType;
    }


    @Override
    public void hit(int damage) {

        switch (barrelType) {
            case PLASTIC:
                barrelType.setMaxDamage(barrelType.getMaxDamage()-damage);
                currentDamage += damage;
                if (barrelType.getMaxDamage() <= 0) {
                    destroyed = true;
                    System.out.println("I'm a plastic barrel");

                }
                break;
            case WOOD:
                barrelType.setMaxDamage(barrelType.getMaxDamage()-damage);
                currentDamage += damage;
                if (barrelType.getMaxDamage() == 0) {
                    destroyed = true;
                    System.out.println("I'm a wood barrel");
                }

                break;
            case METAL:
                barrelType.setMaxDamage(barrelType.getMaxDamage()-damage);
                currentDamage += damage;
                if (barrelType.getMaxDamage() == 0) {
                    destroyed = true;
                    System.out.println("I'm a metal barrel");
                }

                break;
            default:
                System.out.println("You cant build this type of barrels");
        }


    }

    @Override
    public boolean isDestroyed() {
        return destroyed;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
