package org.example;

import java.awt.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // int legsWalkedOn, Color color, Type primaryType, SecondaryType secondaryType, Region region

        // Kanto
        Pokemon charmander = new Pokemon(2, Color.orange, Type.FIRE, SecondaryType.NONE, Region.KANTO);
        Pokemon bulbasaur = new Pokemon(4, Color.green, Type.GRASS, SecondaryType.POISON, Region.KANTO);
        Pokemon squirtle = new Pokemon(2, Color.blue, Type.WATER, SecondaryType.NONE, Region.KANTO);

        // Johto
        Pokemon cyndaquil = new Pokemon(2, Color.orange, Type.FIRE, SecondaryType.NONE, Region.KANTO);
        Pokemon bulbasaur = new Pokemon(4, Color.green, Type.GRASS, SecondaryType.POISON, Region.KANTO);
        Pokemon squirtle = new Pokemon(2, Color.blue, Type.WATER, SecondaryType.NONE, Region.KANTO);


    }
}