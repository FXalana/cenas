package org.academiadecodigo.bootcamp11.pokemon.map;


import org.academiadecodigo.bootcamp11.pokemon.map.city.*;

/**
 * Each map knows what cities exist.
 * Each map can tell what city comes next.
 * A map can give you a message telling you which cities are cleared.
 * In that message, mark an X next to those which are cleared.
 */

public class Map {

    private City[] cities;

    public Map(City homeTown) {
        cities = new City[]{
                homeTown,
                new ViridianCity(),
                new PewterCity(),
                new CeruleanCity(),
                new VermilionCity()
        };
    }

    public String showProgress() {
        return "";
    }
}
