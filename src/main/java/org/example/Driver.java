package org.example;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

        boolean y = true;
        boolean n = false;

        Scanner scan = new Scanner(System.in);

        // Gen I
        // 10111011

        HashMap charmander = new HashMap();
        charmander.put("name", "Charmander");
        charmander.put("twoLegs", y);
        charmander.put("hair", n);
        charmander.put("coloredEyes", y);
        charmander.put("nails", y);
        charmander.put("teeth", y);
        charmander.put("shell", n);
        charmander.put("sphereHead", y);
        charmander.put("individualToes", y);

        // 00111001

        HashMap bulbasaur = new HashMap();
        bulbasaur.put("name", "Bulbasaur");
        bulbasaur.put("twoLegs", n);
        bulbasaur.put("hair", n);
        bulbasaur.put("coloredEyes", y);
        bulbasaur.put("nails", y);
        bulbasaur.put("teeth", y);
        bulbasaur.put("shell", n);
        bulbasaur.put("sphereHead", n);
        bulbasaur.put("individualToes", y);

        // 10100111

        HashMap squirtle = new HashMap();
        squirtle.put("name", "Squirtle");
        squirtle.put("twoLegs", y);
        squirtle.put("hair", n);
        squirtle.put("coloredEyes", y);
        squirtle.put("nails", n);
        squirtle.put("teeth", n);
        squirtle.put("shell", y);
        squirtle.put("sphereHead", y);
        squirtle.put("individualToes", y);

        // Gen II
        // 01110000

        HashMap chikorita = new HashMap();
        chikorita.put("name", "Chikorita");
        chikorita.put("twoLegs", n);
        chikorita.put("hair", y);
        chikorita.put("coloredEyes", y);
        chikorita.put("nails", y);
        chikorita.put("teeth", n);
        chikorita.put("shell", n);
        chikorita.put("sphereHead", n);
        chikorita.put("individualToes", n);

        // 00010000

        HashMap cyndaquil = new HashMap();
        cyndaquil.put("name", "Cyndaquil");
        cyndaquil.put("twoLegs", n);
        cyndaquil.put("hair", n);
        cyndaquil.put("coloredEyes", n);
        cyndaquil.put("nails", y);
        cyndaquil.put("teeth", n);
        cyndaquil.put("shell", n);
        cyndaquil.put("sphereHead", n);
        cyndaquil.put("individualToes", n);

        // 10101001

        HashMap totodile = new HashMap();
        totodile.put("name", "Totodile");
        totodile.put("twoLegs", y);
        totodile.put("hair", n);
        totodile.put("coloredEyes", y);
        totodile.put("nails", n);
        totodile.put("teeth", y);
        totodile.put("shell", n);
        totodile.put("sphereHead", n);
        totodile.put("individualToes", y);

        // Gen III
        // 10100001

        HashMap treecko = new HashMap();
        treecko.put("name", "Treecko");
        treecko.put("twoLegs", y);
        treecko.put("hair", n);
        treecko.put("coloredEyes", y);
        treecko.put("nails", n);
        treecko.put("teeth", n);
        treecko.put("shell", n);
        treecko.put("sphereHead", n);
        treecko.put("individualToes", y);

        // 11010011

        HashMap torchic = new HashMap();
        torchic.put("name", "Torchic");
        torchic.put("twoLegs", y);
        torchic.put("hair", y);
        torchic.put("coloredEyes", n);
        torchic.put("nails", y);
        torchic.put("teeth", n);
        torchic.put("shell", n);
        torchic.put("sphereHead", y);
        torchic.put("individualToes", y);

        // 0000001

        HashMap mudkip = new HashMap();
        mudkip.put("name", "Mudkip");
        mudkip.put("twoLegs", n);
        mudkip.put("hair", n);
        mudkip.put("coloredEyes", n);
        mudkip.put("nails", n);
        mudkip.put("teeth", n);
        mudkip.put("shell", n);
        mudkip.put("sphereHead", n);
        mudkip.put("individualToes", y);

        // Gen IV
        //0110010

        HashMap turtwig = new HashMap();
        turtwig.put("name", "Turtwig");
        turtwig.put("twoLegs", n);
        turtwig.put("hair", y);
        turtwig.put("coloredEyes", y);
        turtwig.put("nails", n);
        turtwig.put("teeth", n);
        turtwig.put("shell", y);
        turtwig.put("sphereHead", n);
        turtwig.put("individualToes", n);

        // 11100001

        HashMap chimchar = new HashMap();
        chimchar.put("name", "Chimchar");
        chimchar.put("twoLegs", y);
        chimchar.put("hair", y);
        chimchar.put("coloredEyes", y);
        chimchar.put("nails", n);
        chimchar.put("teeth", n);
        chimchar.put("shell", n);
        chimchar.put("sphereHead", n);
        chimchar.put("individualToes", y);

        // 10100011

        HashMap piplup = new HashMap();
        piplup.put("name", "Piplup");
        piplup.put("twoLegs", y);
        piplup.put("hair", n);
        piplup.put("coloredEyes", y);
        piplup.put("nails", n);
        piplup.put("teeth", n);
        piplup.put("shell", n);
        piplup.put("sphereHead", y);
        piplup.put("individualToes", y);

        // Gen V
        // 10100000
        HashMap snivy = new HashMap();
        snivy.put("name", "Snivy");
        snivy.put("twoLegs", y);
        snivy.put("hair", n);
        snivy.put("coloredEyes", y);
        snivy.put("nails", n);
        snivy.put("teeth", n);
        snivy.put("shell", n);
        snivy.put("sphereHead", n);
        snivy.put("individualToes", n);

        // 00000000
        HashMap tepig = new HashMap();
        tepig.put("name", "Tepig");
        tepig.put("twoLegs", n);
        tepig.put("hair", n);
        tepig.put("coloredEyes", n);
        tepig.put("nails", n);
        tepig.put("teeth", n);
        tepig.put("shell", n);
        tepig.put("sphereHead", n);
        tepig.put("individualToes", n);

        // 10001011
        HashMap oshawott = new HashMap();
        oshawott.put("name", "Oshawott");
        oshawott.put("twoLegs", y);
        oshawott.put("hair", n);
        oshawott.put("coloredEyes", n);
        oshawott.put("nails", n);
        oshawott.put("teeth", y);
        oshawott.put("shell", n);
        oshawott.put("sphereHead", y);
        oshawott.put("individualToes", y);

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
        database.add(turtwig);
        database.add(chimchar);
        database.add(piplup);
        database.add(snivy);
        database.add(tepig);
        database.add(oshawott);

        System.out.println("Welcome to the Pokemon Beginner Guessing Game!");
        System.out.println("----------------------------------------------\n");

        System.out.println("I will ask you a series of questions to guess your favorite beginner,\n " +
                "and you will answer by typing '1' for Yes, or '2' for No.");
        System.out.println("");

        while (scan.nextInt() != 0) {

            System.out.println("Does your Pokemon walk on two legs?");
            TakeInput(scan.nextInt(), "twoLegs", database);

            System.out.println("Does your Pokemon have hair, or something that represents hair, on top of their head?");
            TakeInput(scan.nextInt(), "hair", database);

            System.out.println("Does your Pokemon have colored eyes (aside from black/white)?");
            TakeInput(scan.nextInt(), "coloredEyes", database);

            System.out.println("Does your Pokemon have nails on their hands/feet?");
            TakeInput(scan.nextInt(), "nails", database);

            System.out.println("Does your Pokemon have teeth (even if only 1 or 2)?");
            TakeInput(scan.nextInt(), "teeth", database);

            System.out.println("Does your Pokemon have a shell?");
            TakeInput(scan.nextInt(), "shell", database);

            System.out.println("Does your Pokemon have spherical shaped head?");
            TakeInput(scan.nextInt(), "sphereHead", database);

            System.out.println("Does your Pokemon have individual toes/claws?");
            TakeInput(scan.nextInt(), "individualToes", database);

        }

    }

    public static void TakeInput(int answer, String property, ArrayList database) {

        boolean ans;
        ArrayList toRemove = new ArrayList();

        if (answer == 1) {
            ans = true;
        } else {
            ans = false;
        }
        for (Object d : database) {
            HashMap character = (HashMap) d;
            boolean prop = (boolean) character.get(property);
            if (prop != ans) {
                toRemove.add(character);
            }
        }
        for (Object ch : toRemove) {
            database.remove(ch);
        }
        if (database.size() == 1) {

            HashMap character = (HashMap) database.get(0);
            String name = (String) character.get("name");
            System.out.println("Your favorite beginner Pokemon is: " + name);
            System.exit(0);
        }
        if (database.size() == 0) {
            System.out.println("Hm, it doesn't appear that your selections match any Pokemon in our database.");
            System.exit(0);
        }


    }
}