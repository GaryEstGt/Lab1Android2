package com.example.garya.lab1android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.PList)
    ListView PlayView;
    @BindView(R.id.swAscendenteDescendente)
    SwitchCompat swAscendenteDescendente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_Nombre, R.id.btnDuracion, R.id.btnascendente, R.id.btnDescendente})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_Nombre:
                verEnLista(Data.getInstance().playlist.OrdenaporNombre(swAscendenteDescendente.isChecked()));
                break;
            case R.id.btnDuracion:
                verEnLista(Data.getInstance().playlist.OrdenaporDuracion(swAscendenteDescendente.isChecked()));
                break;
            //case R.id.btnRegresar:
            // Intent intent2 = new Intent (getApplicationContext(), MainActivity.class);
            //startActivity(intent2);
            //  break;
        }
    }

    public void verEnLista(List<Cancion> playlist) {
        ArrayAdapter<Cancion> adapter = new ArrayAdapter<Cancion>(this, android.R.layout.simple_list_item_1, playlist);
        PlayView.setAdapter(adapter);
    }
}
