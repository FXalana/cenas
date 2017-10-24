package org.academiadecodigo.bootcamp11.pokemon.trainer;

import org.academiadecodigo.bootcamp11.pokemon.map.city.City;

/**
 * Each MainCharacter has a homeTown.
 */

public class MainCharacter extends Trainer {
    private City city;

    public MainCharacter(String name, City city){
        super(name);
    }

}
