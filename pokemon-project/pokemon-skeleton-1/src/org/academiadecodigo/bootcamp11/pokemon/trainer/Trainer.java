package org.academiadecodigo.bootcamp11.pokemon.trainer;

/**
 * Each Trainer has a name and 6 pokeBalls.
 * Each pokeBall can store one Pokemon.
 * Each Trainer knows how to catch a Pokemon and how to fight another Trainer.
 */

public abstract class Trainer {

    private String name;
    private int pokeballs;
    private boolean catchPokemon;

    public Trainer(String name) {
        this.name = name;
        this.pokeballs = 6;
    }

    public void setCatchPokemon(boolean catchPokemon) {
        this.catchPokemon = catchPokemon;
    }

    public String getName() {
        return name;
    }

    public void catchingPokemons() {
        while (!catchPokemon) {
            pokeballs--;
            int random = (int)(Math.random() * 3);
            if (random == 3){
                setCatchPokemon(true);
            }
        }
    }

    public void fight(Trainer trainer){

    }
}

