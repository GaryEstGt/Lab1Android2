package com.example.garya.lab1android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.PlayView)
    ListView PlayView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_Nombre, R.id.btnDuracion, R.id.btnascendente, R.id.btnDescendente, R.id.btnRegresar})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_Nombre:
                break;
            case R.id.btnDuracion:
                break;
            case R.id.btnascendente:
                break;
            case R.id.btnDescendente:
                break;
            case R.id.btnRegresar:
                Intent intent2 = new Intent (view.getContext(), MainActivity.class);
                startActivityForResult(intent2, 0);
                break;
        }
    }
}
