package com.example.garya.lab1android;

import android.content.Intent;
import android.support.annotation.NonNull;

import java.util.Comparator;

public class Cancion{
   private String nombre;
   private String album;
   private String artista;
   private int duracion;

    public Cancion(String Nombre, String Album, String Artista, int Duracion){
        nombre=Nombre;
        album=Album;
        artista=Artista;
        duracion=Duracion;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        nombre = Nombre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String Album) {
        album = Album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String Artista) {
        artista = Artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int Duracion) {
        duracion = Duracion;
    }
    @Override
    public String toString() {
        return "Cancion : " +
                "Nombre : " + nombre +
                " | Album : " + album +
                " | Artista : " + artista +
                " | Duracion : " + duracion;
    }
}

class CompareByName implements Comparator<Cancion> {



    @Override

    public int compare(Cancion cancion1, Cancion cancion2) {

        return cancion1.getNombre().compareTo(cancion2.getNombre());

    }

}

class CompareByDuracion implements Comparator<Cancion> {



    @Override

    public int compare(Cancion cancion1, Cancion cancion2) {

        if (cancion1.getDuracion() == cancion2.getDuracion()) {
            return 0;
        }
        else if (cancion1.getDuracion() < cancion2.getDuracion()) {
            return -1;
        }
        else{
            return 1;
        }
    }

}
