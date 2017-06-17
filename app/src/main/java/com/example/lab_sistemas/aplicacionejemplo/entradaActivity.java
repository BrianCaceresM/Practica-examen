package com.example.lab_sistemas.aplicacionejemplo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class entradaActivity extends AppCompatActivity {

    private TextView webside;
    private EditText usuario;
    private EditText contra;
    private String nombre;
    private String num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_entrada);
        webside = (TextView) findViewById(R.id.web);
        usuario = (EditText) findViewById(R.id.usuario);
        contra = (EditText) findViewById(R.id.contra);
        nombre = "brian";
        num ="12345";
    }
    public void web(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.unifranz.edu.bo"));
        startActivity(intent);
    }
    public void salir(View v){
        finish();
    }
    public void ingresar(View v){
        if (usuario.getText().toString().equals(nombre) && contra.getText().toString().equals(num)){
            Intent intent = new Intent(
                    getApplicationContext(),
                    MainActivity.class
            );
            startActivity(intent);
            finish();
        }else{
            Toast.makeText(
                    getApplicationContext(),
                    "Usuario o contraseña invalidos",
                    Toast.LENGTH_LONG).show();
        }
        }

}
