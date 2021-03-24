package com.example.dia23;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;

import androidx.annotation.Nullable;

public class Productos {
    private String Color;
    private int Talla;
    private String Marca;

    public Productos(String color, int talla, String marca) {
        this.Color = color;
        this.Talla = talla;
        this.Marca = marca;
    }

    public Productos() {

    }

    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public int getTalla() {
        return Talla;
    }
    public void setTalla(int talla) {
        this.Talla = talla;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }
}