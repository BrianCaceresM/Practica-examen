package com.example.lab_sistemas.aplicacionejemplo;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Materias extends AppCompatActivity {

    private ListView lvDatos;
    private Activity activity;
    private CustomAdapter adaptador;
    private ArrayList<listas> datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listas);

        lvDatos = (ListView) findViewById(R.id.lvLista);
        activity = this;
        datos = new ArrayList<listas>();

        llenarMaterias();

        adaptador = new CustomAdapter(activity, datos);
        lvDatos.setAdapter(adaptador);
    }
    public void llenarMaterias(){

            Resources resources = getResources();
            String[] arrayNombres = resources.getStringArray(R.array.matterName);
            String[] arrayTipos = resources.getStringArray(R.array.matterInitial);
            TypedArray arrayImgs = resources.obtainTypedArray(R.array.matterType);
            for(int i = 0; i < arrayNombres.length; i++) {
                listas lis = new listas(
                        arrayNombres[i], arrayTipos[i],
                        arrayImgs.getResourceId(i, -1)
                );
                datos.add(lis);
            }
        }

    }

