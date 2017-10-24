package org.academiadecodigo.bootcamp11.sniperElite;

/**
 * Created by codecadet on 02/10/17.
 */
public enum BarrelType {
    PLASTIC(25),
    WOOD(50),
    METAL(75);

    BarrelType( int maxDamage){
        this.maxDamage = maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    private int maxDamage;

    public int getMaxDamage() {
        return maxDamage;
    }


}
