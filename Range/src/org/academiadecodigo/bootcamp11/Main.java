package org.academiadecodigo.bootcamp11;

import java.util.Iterator;

/**
 * Created by codecadet on 10/10/17.
 */
public class Main {
    public static void main(String[] args) {

        Range range = new Range(1, 10, false);

        for (Integer a : range) {
            System.out.println(a);

        }
        range.setDirection(true);

        for (Integer b : range) {
            System.out.println(b);

        }
    }

}
