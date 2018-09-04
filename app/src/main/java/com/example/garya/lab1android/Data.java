package com.example.garya.lab1android;

public class Data {
    private static Data instanciaUnica;

    private Data() {}

    private synchronized static void createInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new Data();
        }
    }

    public static Data getInstance() {
        createInstance();

        return instanciaUnica;
    }

    public Playlist playlist =new Playlist();
}
