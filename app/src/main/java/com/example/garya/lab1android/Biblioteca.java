package com.example.garya.lab1android;

import android.webkit.HttpAuthHandler;

import java.util.HashMap;

public class Biblioteca {
    private HashMap <String,Cancion> biblioteca = new HashMap<String, Cancion>();
    public HashMap<String, Cancion> getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Cancion song) {
        Cancion songTemp=new Cancion("","","",0);
        songTemp=song;
        biblioteca.put(songTemp.getNombre(),songTemp);
    }
}
