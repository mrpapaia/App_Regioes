package com.example.atv3;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EstadosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EstadosFragment extends Fragment {

    List<Estados> estados;

    public EstadosFragment() {
        // Required empty public constructor
    }

    public EstadosFragment(List<Estados> estados) {

        this.estados = estados;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_estados, container, false);
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(new EstadosAdapter(estados, getContext(), onClickEstados()));
        return v;
    }

    protected EstadosAdapter.EstadosOnClickListener onClickEstados() {
        return new EstadosAdapter.EstadosOnClickListener() {
            @Override
            public void onClickEstados(EstadosAdapter.EstadosViewHolder holder, int idx) {

                Intent it = new Intent(getContext(), DetalhesEstado.class);
                it.putExtra("estado", estados.get(idx));
                startActivity(it);
            }
        };
    }

}