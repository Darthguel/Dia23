package com.example.dia23;

import android.content.Context;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
import android.content.Context;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDeDatos extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Productos.db";

    private BaseDeDatos datos;
    private SQLiteDatabase db;

    public BaseDeDatos (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + ProductoContract.ProductoEntry.TABLE_NAME + " ("

                + ProductoContract.ProductoEntry.COLOR + " INTEGER NOT NULL,"
                + ProductoContract.ProductoEntry.TALLA + " TEXT NOT NULL,"
                + ProductoContract.ProductoEntry.MARCA + " INTEGER NOT NULL)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { }

}
