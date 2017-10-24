package org.academiadecodigo.bootcamp11.calculador;

/**
 * Created by codecadet on 21/09/17.
 */
public enum Operation {

    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String symbol;

    Operation(String symbol){
        this.symbol = symbol;
    }
    public  String getSymbol(){
        return this.symbol;
    }

}

