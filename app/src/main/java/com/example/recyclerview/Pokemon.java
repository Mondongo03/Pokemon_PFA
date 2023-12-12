package com.example.recyclerview;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class Pokemon {
    @PrimaryKey(autoGenerate = true)
    int id;
    String nombre;
    String descripcion;
    String tipo1;
    String tipo2;
    int hp;
    int atq;
    int def;
    int sAtq;
    int sDef;
    int vel;
    String mov1;
    String mov2;
    String mov3;
    String mov4;
    String habilidad;

    public Pokemon(String nombre, String descripcion, String tipo1, String tipo2, int hp, int atq, int def, int sAtq, int sDef, int vel, String mov1, String mov2, String mov3, String mov4, String habilidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.hp = hp;
        this.atq = atq;
        this.def = def;
        this.sAtq = sAtq;
        this.sDef = sDef;
        this.vel = vel;
        this.mov1 = mov1;
        this.mov2 = mov2;
        this.mov3 = mov3;
        this.mov4 = mov4;
        this.habilidad = habilidad;
    }
}
