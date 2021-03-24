package com.example.dia23;

import android.provider.BaseColumns;

    public class ProductoContract {

        public static abstract class ProductoEntry implements BaseColumns {

            public static final String TABLE_NAME ="productos";
            public static final String COLOR  = "COLOR";
            public static final String TALLA = "TALLA";
            public static final String MARCA= "MARCA";

        }
    }


