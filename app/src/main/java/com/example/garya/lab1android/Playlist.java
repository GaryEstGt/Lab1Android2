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

    public List<Cancion> OrdenaporNombre(boolean Descendente) {
        Collections.sort(playlist, new CompareByName());
        if (Descendente) {
            return OrdenaDescendentemente();
        }

        return playlist;
    }

    public List<Cancion> OrdenaporDuracion(boolean Descendente) {
        Collections.sort(playlist, new CompareByDuracion());
        if (Descendente) {
            return OrdenaDescendentemente();
        }
        return playlist;
    }

    public List<Cancion> OrdenaDescendentemente() {
        List<Cancion> lista = new LinkedList<Cancion>();
        for (int i = playlist.size() - 1; i >= 0; i--) {
            lista.add(playlist.get(i));
        }

        return lista;
    }
    public boolean VerSiExiste(Cancion song){
        boolean retorno=false;
        for (Cancion item : playlist) { if ( song.getNombre()==item.getNombre() ){ retorno= true;} }
        return retorno;
    }

}
