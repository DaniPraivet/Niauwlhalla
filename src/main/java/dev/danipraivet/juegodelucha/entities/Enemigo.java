package dev.danipraivet.juegodelucha.entities;

import dev.danipraivet.juegodelucha.map.Plataforma;

import java.awt.*;

public class Enemigo extends Entidad{
    public Enemigo(int x, int y) {
        super(x,y,30,50,Color.RED);
    }
}
