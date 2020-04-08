package com.example.pi_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Inmueble> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();
        generarListView();
    }

    public void generarListView(){
        ArrayAdapter adapter = new ListaAdapter(this,R.layout.item,lista,getLayoutInflater());

        ListView lv = findViewById(R.id.milista);
        lv.setAdapter(adapter);
    }

    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.casa1,"Juana Koslay",80000));
        lista.add(new Inmueble(R.drawable.casa2,"Potrero de Los Funes",50000));
        lista.add(new Inmueble(R.drawable.casa3,"El Trapiche",90000));
    }
}
