package org.academiadecodigo.bootcamp11.pokemon.trainer;

import org.academiadecodigo.bootcamp11.pokemon.map.city.City;

/**
 * Each Opponent has a name and a set of Pokemon.
 */

public class Opponent extends Trainer {

    private City city;

    public Opponent(String name, City city){
        super(name);
    }
}
