package org.academiadecodigo.bootcamp11.pokemon.pokemon;

/**
 * Each type knows if it beats another Type.
 */

public enum Type {

    WATER,
    GRASS,
    FIRE,
    ROCK,
    STEEL,
    GROUND,
    BUG,
    ELECTRIC,
    FLYING;

    private Type[] beatsWhat() {

        switch (this) {
            case GROUND:
                return new Type[] {FIRE, ELECTRIC, ROCK, STEEL};
            case ELECTRIC:
                return new Type[]{WATER, FLYING};
            case BUG:
                return new Type[]{GRASS};
            case FLYING:
                return new Type[]{GRASS, BUG};
            case FIRE:
                return new Type[]{GRASS, STEEL, BUG};
            case ROCK:
                return new Type[]{FIRE};
            case GRASS:
                return new Type[]{WATER, ROCK, GROUND};
            case STEEL:
                return new Type[]{ROCK};
            case WATER:
                return new Type[]{FIRE, ROCK, GROUND};
            default:
                System.out.println("Unknown type!");
                return null;
        }
    }

}
