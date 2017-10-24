package org.academiadecodigo.bootcamp11.pokemon.map.city;

import org.academiadecodigo.bootcamp11.pokemon.trainer.MainCharacter;

/**
 *  Each city has a name.
 *  You can play every city.
 *  You can find enemies in cities.
 */

public abstract class City {

    private boolean cleared;

    public City() {
        cleared = false;
    }

    public abstract void play(MainCharacter character);

}
