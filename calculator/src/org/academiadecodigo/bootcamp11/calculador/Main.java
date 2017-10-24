package org.academiadecodigo.bootcamp11.calculador;

/**
 * Created by codecadet on 18/09/17.
 */
public class Main {

    public static void main(String[] args) {



        Calculator chinese = new Calculator("CaZio", "Green");
        chinese.setBrand("caZio");

        // chinese.brand = "caZio";
        // chinese.color = "Green";

        Calculator thai = new Calculator("sei lá", "HOT PINK");

        // thai.brand = "Sei lá";
        // thai.color = "HOT PINK";

        System.out.println("Calculator is a: " + chinese.getBrand() + " of color " + chinese.getColor());
        System.out.println("Calculator is a: " + thai.getBrand() + " of color " + thai.getColor());


        chinese.doMath(1, 2, Operation.ADD);

        chinese.doMath(1, 2, Operation.DIVIDE);

        chinese.doMath(1, 2, Operation.SUBTRACT);

        chinese.doMath(1, 2, Operation.MULTIPLY);







       /* int intAdd = thai.add(1, 1);
        int intSub = thai.sub(1, 1);
        int intMult = thai.mult(2, 2);
        int intDiv = thai.div(4, 2);

        float floAdd = thai.add(1.5f, 1.5f);
        float floSub = thai.sub(1.5f, 1.5f);
        float floMult = thai.mult(2.2f, 2.2f);
        float floDiv = thai.div(4.3f, 2.2f);


        System.out.println(intAdd);
        System.out.println(intSub);
        System.out.println(intMult);
        System.out.println(intDiv);

        System.out.println(floAdd);
        System.out.println(floSub);
        System.out.println(floMult);
        System.out.println(floDiv);*/


    }

}

