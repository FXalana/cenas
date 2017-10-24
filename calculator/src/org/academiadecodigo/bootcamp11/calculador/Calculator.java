package org.academiadecodigo.bootcamp11.calculador;

/**
 * Created by codecadet on 18/09/17.
 */
public class Calculator {

    private String brand;
    private String color;

    private Operation operation;


    public Calculator() {
        this.brand = "Qualquer coisa";
        this.color = "kaalksdj";

    }

    public Calculator(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return this.brand;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return this.color;

    }

    public int doMath(int number1, int number2, Operation operation) {

        switch (operation) {
            case ADD:
                return add(number1, number2);

            case SUBTRACT:
                return sub(number1, number2);

            case DIVIDE:
                return div(number1, number2);

            case MULTIPLY:
                return mult(number1, number2);

            default:
                return 0;



        }

    }


    public void setColor(String brand) {
        this.color = color;
    }


    public int add(int numberOne, int numberTwo) {

        //numberOne = 2;
        //numberTwo = 4;

        //System.out.println(numberOne + numberTwo);

        return numberOne + numberTwo;

    }

    public int sub(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public int mult(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    public int div(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

    public float add(float numberOne, float numberTwo) {
        return numberOne + numberTwo;
    }

    public float sub(float numberOne, float numberTwo) {
        return numberOne + numberTwo;

    }

    public float mult(float numberOne, float numberTwo) {
        return numberOne + numberTwo;
    }

    public float div(float numberOne, float numberTwo) {
        return numberOne + numberTwo;
    }

}






