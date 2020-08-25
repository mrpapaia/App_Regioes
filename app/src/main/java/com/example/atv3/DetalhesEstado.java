package com.example.atv3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetalhesEstado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_estado);
        TextView nomeEstado = findViewById(R.id.tvNome);
        TextView capital = findViewById(R.id.tvNomeCapital);
        TextView qtdHabitantes = findViewById(R.id.tvHab);
        ImageView mapa = findViewById(R.id.imgMapa);
        Intent it = getIntent();
        Estados estado = (Estados) it.getSerializableExtra("estado");
        nomeEstado.setText(estado.getNome());
        capital.setText("Capital: " + estado.getCapital());
        qtdHabitantes.setText("População: " + estado.getPopulação());
        mapa.setImageResource(estado.getMapa());
    }
}
