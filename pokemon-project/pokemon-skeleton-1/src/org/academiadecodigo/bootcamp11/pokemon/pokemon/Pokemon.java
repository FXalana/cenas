package org.academiadecodigo.bootcamp11.pokemon.pokemon;

/**
 * Each Pokemon has a type, name and level.
 * Each Pokemon knows how to fight another Pokemon.
 * Every Pokemon gets 3 levels after each win.
 */

public class Pokemon {

    private boolean fainted;
    private Type pokemonType;
    private String name;
    private int hp;

    public Pokemon(String name,Type PokemonType) {
        this.name = name;
        hp = 30;
        fainted = true;
    }


}
