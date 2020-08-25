package com.example.atv3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.List;


public class InfoRegioes extends Fragment {

    List<Estados> estados;
    Regioes regiao;

    public InfoRegioes() {
        // Required empty public constructor
    }

    public InfoRegioes(Regioes regiao) {
        this.regiao = regiao;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_info, container, false);
        ImageView imgMapa = v.findViewById(R.id.imgMapa);
        imgMapa.setImageResource(regiao.getMapa());
        TextView tvRegiEco = v.findViewById(R.id.tvRegiEco);
        TextView tvQtdEstados = v.findViewById(R.id.tvQtdEstados);
        TextView tvGentilico = v.findViewById(R.id.tvGentilico);
        TextView tvArea = v.findViewById(R.id.tvArea);
        TextView tvPopulacao = v.findViewById(R.id.tvPopulacao);
        TextView tvDencidade = v.findViewById(R.id.tvDencidade);
        TextView tvPIB = v.findViewById(R.id.tvPIB);
        TextView tvPIBPERCAPITA = v.findViewById(R.id.tvPIBPERCAPITA);
        TextView tvIDH = v.findViewById(R.id.tvIDH);
        tvRegiEco.setText(tvRegiEco.getText() + regiao.getRegiaoGeoeconomica());
        tvQtdEstados.setText(tvQtdEstados.getText() + regiao.getQtsEstados());
        tvGentilico.setText(tvGentilico.getText() + regiao.getGentilico());
        tvArea.setText(tvArea.getText() + regiao.getArea());
        tvPopulacao.setText(tvPopulacao.getText() + regiao.getPopulacao());
        tvDencidade.setText(tvDencidade.getText() + regiao.getDensidade());
        tvPIB.setText(tvPIB.getText() + regiao.getPib());
        tvPIBPERCAPITA.setText(tvPIBPERCAPITA.getText() + regiao.getPibPerCapita());
        tvIDH.setText(tvIDH.getText() + regiao.getIdh());


        return v;
    }
}