package com.example.garya.lab1android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtBusca)
    EditText txtBusca;
    @BindView(R.id.ListSong)
    ListView ListSong;
    Biblioteca canciones = new Biblioteca();
    //Playlist playlist =new Playlist();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        canciones.setBiblioteca(new Cancion("Ocaso", "Single", "andrez", 120));
        canciones.setBiblioteca(new Cancion("She", "Single", "andrez", 300));
        canciones.setBiblioteca(new Cancion("Tiempo de admitir", "Single", "andrez y theerion", 200));
        canciones.setBiblioteca(new Cancion("With out me", "Single", "Eminem", 100));
        canciones.setBiblioteca(new Cancion("Imposible", "Nebula", "Khan", 200));
        canciones.setBiblioteca(new Cancion("Medios de manipulacion", "Single", "andrez y theerion", 200));
        ListSong.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                int item = position;
                Cancion itemval = (Cancion) ListSong.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Cancion agregada al playlist", Toast.LENGTH_LONG).show();
                Data.getInstance().playlist.setPlaylist(itemval);
            }

        });
    }

    @OnClick({R.id.btnBuscar, R.id.btnPlaylist})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnBuscar:
                String nombre;
                nombre = txtBusca.getText().toString();
                if (canciones.getBiblioteca().containsKey(nombre)) {
                    String dato[] = new String[]{canciones.getBiblioteca().get(nombre).toString()};
                    Cancion find[]= new Cancion[]{canciones.getBiblioteca().get(nombre)};
                    //Mostrar en lista
                    ArrayAdapter<Cancion> adapter = new ArrayAdapter<Cancion>(this, android.R.layout.simple_list_item_1,find);
                    ListSong.setAdapter(adapter);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Cancion no encontrada", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnPlaylist:
                Intent prueb = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(prueb);
                break;
        }
    }

    //@OnClick(R.id.ListSong)
    //public void onViewClicked() {

   // }
}
