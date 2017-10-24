package org.academiadecodigo.bootcamp11.uniqueWord;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by codecadet on 12/10/17.
 */
public class Main {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        Set<String> t = new TreeSet<>();

        t.add("ananas e ananas");


        System.out.println(t);
    }
}
