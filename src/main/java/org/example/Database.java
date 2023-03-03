package org.example;

import java.awt.*;

public class Database {

    // int legsWalkedOn, Color color, Type primaryType, SecondaryType secondaryType, Region region Color secondaryColor

    // Kanto
    Pokemon charmander = new Pokemon(2, Color.orange, Type.FIRE, SecondaryType.NONE, Region.KANTO);
    Pokemon bulbasaur = new Pokemon(4, Color.green, Type.GRASS, SecondaryType.POISON, Region.KANTO);
    Pokemon squirtle = new Pokemon(2, Color.blue, Type.WATER, SecondaryType.NONE, Region.KANTO);

    // Johto
    Pokemon cyndaquil = new Pokemon(2, Color.blue, Type.FIRE, SecondaryType.NONE, Region.JOHTO);
    Pokemon chikorita = new Pokemon(4, Color.green, Type.GRASS, SecondaryType.NONE, Region.JOHTO);
    Pokemon totodile = new Pokemon(2, Color.blue, Type.WATER, SecondaryType.NONE, Region.JOHTO);

    // Hoenn
    Pokemon torchic = new Pokemon(2, Color.ORANGE, Type.FIRE, SecondaryType.NONE, Region.HOENN);
    Pokemon treecko = new Pokemon(2, Color.green, Type.GRASS, SecondaryType.NONE, Region.HOENN);
    Pokemon mudkip = new Pokemon(4, Color.blue, Type.WATER, SecondaryType.NONE, Region.HOENN);

    // Sinnoh
    Pokemon chimchar = new Pokemon(2, Color.RED, Type.FIRE, SecondaryType.NONE, Region.SINNOH);
    Pokemon turtwig = new Pokemon(4, Color.green, Type.GRASS, SecondaryType.NONE, Region.SINNOH);
    Pokemon piplup = new Pokemon(2, Color.blue, Type.WATER, SecondaryType.NONE, Region.SINNOH);

    // Unova
    Pokemon tepig = new Pokemon(4, Color.ORANGE, Type.FIRE, SecondaryType.NONE, Region.UNOVA);
    Pokemon snivy = new Pokemon(2, Color.green, Type.GRASS, SecondaryType.NONE, Region.UNOVA);
    Pokemon oshwatt = new Pokemon(2, Color.blue, Type.WATER, SecondaryType.NONE, Region.UNOVA);
}
