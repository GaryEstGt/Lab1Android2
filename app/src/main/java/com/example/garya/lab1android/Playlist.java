package com.example.garya.lab1android;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Playlist {
    List<Cancion> playlist=new LinkedList<>();
    public List<Cancion> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Cancion song) {
        playlist.add(song);
    }

    public List<Cancion> OrdenaporNombre() {
        Collections.sort(playlist, new CompareByName());

        return playlist;
    }

    public List<Cancion> OrdenaporDuracion() {
        Collections.sort(playlist, new CompareByDuracion());

        return playlist;
    }

    public List<Cancion> OrdenaAscendentemente() {
        return playlist;
    }

    public List<Cancion> OrdenaDescendentemente() {
        List<Cancion> lista = new LinkedList<Cancion>();
        for (int i = playlist.size() - 1; i >= 0; i--) {
            lista.add(playlist.get(i));
        }

        return lista;
    }


}
