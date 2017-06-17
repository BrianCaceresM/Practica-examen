package com.example.lab_sistemas.aplicacionejemplo;

import java.io.Serializable;

public class listas implements Serializable {

    private String Titulo;
    private String Subtitulo;
    private int Imagen;

    public listas(){

    }
    public listas(String titulo){ Titulo=titulo;}
    public listas(String titulo,String subtitulo){
        Titulo = titulo;
        Subtitulo = subtitulo;
    }
    public listas (String titulo,String subtitulo,int imagen){
        Titulo = titulo;
        Subtitulo = subtitulo;
        Imagen = imagen;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getSubtitulo() {
        return Subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        Subtitulo = subtitulo;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }
}
