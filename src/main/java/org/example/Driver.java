package org.example;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

        boolean y = true;
        boolean n = false;

        Scanner scan = new Scanner(System.in);

        // 10111

        HashMap charmander = new HashMap();
        charmander.put("name", "Charmander");
        charmander.put("twoLegs", y);
        charmander.put("hair", n);
        charmander.put("coloredEyes", y);
        charmander.put("nails", y);
        charmander.put("teeth", y);
        charmander.put("shell", n);

        // 00111

        HashMap bulbasaur = new HashMap();
        bulbasaur.put("name", "Bulbasaur");
        bulbasaur.put("twoLegs", n);
        bulbasaur.put("hair", n);
        bulbasaur.put("coloredEyes", y);
        bulbasaur.put("nails", y);
        bulbasaur.put("teeth", y);
        bulbasaur.put("shell", n);

        // 10100

        HashMap squirtle = new HashMap();
        squirtle.put("name", "Squirtle");
        squirtle.put("twoLegs", y);
        squirtle.put("hair", n);
        squirtle.put("coloredEyes", y);
        squirtle.put("nails", n);
        squirtle.put("teeth", n);
        squirtle.put("shell", y);

        // 01110

        HashMap chikorita = new HashMap();
        chikorita.put("name", "Chikorita");
        chikorita.put("twoLegs", n);
        chikorita.put("hair", y);
        chikorita.put("coloredEyes", y);
        chikorita.put("nails", y);
        chikorita.put("teeth", n);
        chikorita.put("shell", n);

        // 00010

        HashMap cyndaquil = new HashMap();
        cyndaquil.put("name", "Cyndaquil");
        cyndaquil.put("twoLegs", n);
        cyndaquil.put("hair", n);
        cyndaquil.put("coloredEyes", n);
        cyndaquil.put("nails", y);
        cyndaquil.put("teeth", n);
        cyndaquil.put("shell", n);

        // 10101

        HashMap totodile = new HashMap();
        totodile.put("name", "Totodile");
        totodile.put("twoLegs", y);
        totodile.put("hair", n);
        totodile.put("coloredEyes", y);
        totodile.put("nails", n);
        totodile.put("teeth", y);
        totodile.put("shell", n);

        // 101000

        HashMap treecko = new HashMap();
        treecko.put("name", "Treecko");
        treecko.put("twoLegs", y);
        treecko.put("hair", n);
        treecko.put("coloredEyes", y);
        treecko.put("nails", n);
        treecko.put("teeth", n);
        treecko.put("shell", n);

        // 110100

        HashMap torchic = new HashMap();
        torchic.put("name", "Torchic");
        torchic.put("twoLegs", y);
        torchic.put("hair", y);
        torchic.put("coloredEyes", n);
        torchic.put("nails", y);
        torchic.put("teeth", n);
        torchic.put("shell", n);

        // 00000

        HashMap mudkip = new HashMap();
        mudkip.put("name", "Mudkip");
        mudkip.put("twoLegs", n);
        mudkip.put("hair", n);
        mudkip.put("coloredEyes", n);
        mudkip.put("nails", n);
        mudkip.put("teeth", n);
        mudkip.put("shell", n);

        ArrayList database = new ArrayList();
        database.add(charmander);
        database.add(bulbasaur);
        database.add(squirtle);
        database.add(chikorita);
        database.add(cyndaquil);
        database.add(totodile);
        database.add(treecko);
        database.add(torchic);
        database.add(mudkip);

        System.out.println("Welcome to the Pokemon Beginner Guessing Game!");
        System.out.println("----------------------------------------------\n");

        System.out.println("I will ask you a series of questions to guess your favorite beginner,\n " +
                "and you will answer by typing '1' for Yes, or '2' for No.");
        System.out.println("");

        System.out.println("Does your Pokemon walk on two legs?");
        TakeInput(scan.nextInt(), "twoLegs", database);

        System.out.println("Does your Pokemon have hair on top of their head?");
        TakeInput(scan.nextInt(), "hair", database);

        System.out.println("Does your Pokemon have colored eyes (aside from black/white)?");
        TakeInput(scan.nextInt(), "coloredEyes", database);

        System.out.println("Does your Pokemon have nails on their hands/feet?");
        TakeInput(scan.nextInt(), "nails", database);

        System.out.println("Does your Pokemon have teeth (even if only 1 or 2)?");
        TakeInput(scan.nextInt(), "teeth", database);

    }

    public static void TakeInput(int answer, String property, ArrayList database) {

        boolean ans;
        ArrayList toRemove = new ArrayList();

        if (answer == 1) {
            ans = true;
        }
        else {
            ans = false;
        }
        for (Object d: database){
            HashMap character = (HashMap) d;
            boolean prop = (boolean)character.get(property);
            if (prop != ans) {
                toRemove.add(character);
            }
        }
        for (Object ch: toRemove) {
            database.remove(ch);
        }
        if (database.size() == 1) {

            HashMap character = (HashMap)database.get(0);
            String name = (String)character.get("name");
            System.out.println("Your favorite beginner Pokemon is: " + name);
            System.exit(0);
        }
        if (database.size() == 0) {
            System.out.println("Hm, it doesn't appear that your selections match any Pokemon in our database.");
            System.exit(0);
        }


    }
}