package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

public class CarFactory {

    private Car newCar;


    public CarFactory(Car newCar) {
        this.newCar = newCar;
    }


    public static Car getNewCar(CarType carType) {

        Position position = new Position((int) (Math.random() * Field.width + 1),
                (int) (Math.random() * Field.height + 1));

        if ((int) (Math.random() * 2) == 1) {
            carType.equals(CarType.FIAT);
            return new Fiat(position, 1);
        } else
            carType.equals(CarType.MUSTANG);
        return new Mustang(position, 2);

    }
}
