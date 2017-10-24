package org.academiadecodigo.bootcamp11.pokemon.map.city;

/**
 * In this city, there are the following Pokemon:
 *      - a level 6 GROUND Pokemon named Gligar.
 * In this city, there's an WATER gymBadge.
 * In this city, there are the following Opponents:
 *      - an Opponent named The Sensational Sisters with the following Pokemon:
 *              - level 7 WATER Pokemon named Seel.
 *              - level 7 WATER Pokemon namer Shellder.
 *      - an Opponent named Team Rocket with the following Pokemon:
 *              - a pokemon they stole from you (Bulbasaur).
 *      - an Opponent named Misty with the following Pokemon:
 *              - level 14 WATER Pokemon named Horsea.
 *              - level 17 WATER Pokemon named Starmie.
 *
 *  Show a message stating that you've arrived here.
 *  You must heal all your pokemons.
 *  You must catch Gligar, or you lose.
 *
 *  You must find and fight The Sensational Sisters.
 *  If The Sensational Sisters win, you lose the game.
 *  If you beat them, Team Rocket steals the first pokemon you used.
 *
 *  You must find and fight Team Rocket.
 *  If Team Rocket wins, you lose the game.
 *  If you beat them, you must get your pokemon back and heal all your pokemon.
 *
 *  You must find and fight Misty.
 *  If Misty wins, you lose the game.
 *  If you beat Misty, you get the badge and mark city as cleared.
 *
 *  Show a message with a list of all your Pokemon.
 */

import org.academiadecodigo.bootcamp11.pokemon.pokemon.Type;
import org.academiadecodigo.bootcamp11.pokemon.trainer.MainCharacter;

public class CeruleanCity extends City {

    private Type gymBadge;

    @Override
    public void play(MainCharacter character) {

    }
}
