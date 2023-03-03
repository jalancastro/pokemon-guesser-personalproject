package org.example;

import java.awt.*;
import java.util.Objects;

public class Pokemon {

    private int legsWalkedOn;
    private Color color;
    private Type primaryType;
    private SecondaryType secondaryType;
    private Region region;

    public Pokemon() {
    }

    public Pokemon(int legsWalkedOn, Color color, Type primaryType, SecondaryType secondaryType, Region region) {
        this.legsWalkedOn = legsWalkedOn;
        this.color = color;
        this.primaryType = primaryType;
        this.secondaryType = secondaryType;
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return legsWalkedOn == pokemon.legsWalkedOn && Objects.equals(color, pokemon.color) && primaryType == pokemon.primaryType && secondaryType == pokemon.secondaryType && region == pokemon.region;
    }

    @Override
    public int hashCode() {
        return Objects.hash(legsWalkedOn, color, primaryType, secondaryType, region);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pokemon{");
        sb.append("legsWalkedOn=").append(legsWalkedOn);
        sb.append(", color=").append(color);
        sb.append(", primaryType=").append(primaryType);
        sb.append(", secondaryType=").append(secondaryType);
        sb.append(", region=").append(region);
        sb.append('}');
        return sb.toString();
    }

}
