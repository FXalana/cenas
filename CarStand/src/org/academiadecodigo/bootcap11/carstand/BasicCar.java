package org.academiadecodigo.bootcap11.carstand;

/**
 * Created by codecadet on 18/10/17.
 */
public class BasicCar implements Car {

    private int price;
    private String specs;

    public BasicCar() {
        this.price = 500;
    }

    @Override
    public String getSpecs() {
        return specs;
    }

    @Override
    public int getPrice() {
        return price;
    }


}
