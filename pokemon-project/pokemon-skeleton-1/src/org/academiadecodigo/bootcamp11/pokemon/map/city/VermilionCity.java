package org.academiadecodigo.bootcamp11.pokemon.map.city;

import org.academiadecodigo.bootcamp11.pokemon.pokemon.Type;
import org.academiadecodigo.bootcamp11.pokemon.trainer.MainCharacter;

/**
 * In this city, there are the following Pokemon:
 *      - a level 10 BUG Pokemon named Caterpie.
 *      - a level 10 FLYING Pokemon named Pidgey
 * In this city, there's an ELECTRIC gymBadge.
 * In this city, there's an Opponent named Lt.Surge with the following Pokemon:
 *      - level 24 ELECTRIC Pokemon named Raichu.
 *
 *  Show a message stating that you've arrived here.
 *  You must heal all your pokemons.
 *  You must catch both Pidgey and Caterpie, or you lose.
 *
 *  You must find and fight Lt. Surge.
 *  If Lt. Surge wins, you lose the game.
 *  If you beat him, you must release Pidgey or Caterpie.
 *  If you don't, you lose the game.
 *  If you do, you get the badge and mark city as cleared.
 *
 *  Show a message with a list of all your Pokemon.
 *
 *  You are now a Pokemon Master!
 */

public class VermilionCity extends City {

    private Type gymBadge;

    @Override
    public void play(MainCharacter character) {

    }
}
