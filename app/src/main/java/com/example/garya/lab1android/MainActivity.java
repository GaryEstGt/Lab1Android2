package com.example.garya.lab1android;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtBusca)
    EditText txtBusca;
    @BindView(R.id.ListSong)
    ListView ListSong;
    Biblioteca canciones = new Biblioteca();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        canciones.setBiblioteca(new Cancion("Ocaso", "Single", "andrez", 200));
        canciones.setBiblioteca(new Cancion("She", "Single", "andrez", 200));
        canciones.setBiblioteca(new Cancion("Tiempo de admitir", "Single", "andrez y theerion", 200));
        canciones.setBiblioteca(new Cancion("With out me", "Single", "Eminem", 200));
        canciones.setBiblioteca(new Cancion("Imposible", "Nebula", "Khan", 200));
        canciones.setBiblioteca(new Cancion("Medios de manipulacion ", "Single", "andrez y theerion", 200));
    }

    @OnClick({R.id.btnBuscar, R.id.btnPlaylist})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnBuscar:
                    String nombre;
                    nombre=txtBusca.getText().toString();
                    String dato[]=new String[]{ canciones.getBiblioteca().get(nombre).toString()};

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dato);
                ListSong.setAdapter(adapter );
                break;
            case R.id.btnPlaylist:
                break;
        }
    }
}
