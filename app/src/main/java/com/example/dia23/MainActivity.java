package com.example.dia23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     EditText texto1,texto2,texto3;
     Button boton1;
    Button boton2;
    Button boton3;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto1 = (EditText)findViewById(R.id.edt1);
        texto2 = (EditText)findViewById(R.id.edt2);
        texto3 = (EditText)findViewById(R.id.edt3);
        boton1 = (Button)findViewById(R.id.BOTON1);
        boton2 = (Button)findViewById(R.id.BOTON2);
        boton3 = (Button)findViewById(R.id.BOTON3);


        boton1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

                 Productos prod = new Productos();
                CrudProducto arco = new CrudProducto( getApplicationContext());

                prod.setColor(texto1.getText().toString());
                prod.setTalla(Integer.parseInt(texto2.getText().toString()));
                prod.setMarca(texto3.getText().toString());

                arco.insertar(prod);

            }
        });

         boton2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 Productos prod = new Productos();
                 CrudProducto arco = new CrudProducto( getApplicationContext());

                 prod.setColor(texto1.getText().toString());
                 prod.setTalla(Integer.parseInt(texto2.getText().toString()));
                 prod.setMarca(texto3.getText().toString());
                 arco.editar(prod);


             }
         });


         boton3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
             String x;

                 //Productos prod = new Productos();
                 CrudProducto arco = new CrudProducto( getApplicationContext());

                 //prod.setColor(texto1.getText().toString());
                 //prod.setTalla(Integer.parseInt(texto2.getText().toString()));
                 x = texto3.getText().toString();
                 arco.borrar(x);


             }
         });

    }




}