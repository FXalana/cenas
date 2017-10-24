package org.academiadecodigo.bootcap11.carstand;

/**
 * Created by codecadet on 18/10/17.
 */
public abstract class PimpCar implements Car {

    private int price;
    private String specs;
    private Car car;

    public PimpCar(int price, String specs, Car car) {
        this.price = price;
        this.specs = specs;
        this.car = car;
    }

    @Override
    public int getPrice() {
        return car.getPrice() + price;
    }

    @Override
    public String getSpecs() {
        return car.getSpecs() + specs;
    }

}

