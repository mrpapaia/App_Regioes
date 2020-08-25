package com.example.atv3;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class EstadosAdapter extends RecyclerView.Adapter<EstadosAdapter.EstadosViewHolder> {
    private final List<Estados> list;
    private final Context context;
    private final EstadosOnClickListener onClickListener;

    public EstadosAdapter(List<Estados> list, Context context, EstadosOnClickListener onClickListener) {
        this.list = list;
        this.context = context;
        this.onClickListener = onClickListener;
    }


    @Override
    public EstadosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.estados_adapter, parent, false);

        EstadosViewHolder holder = new EstadosViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final EstadosViewHolder holder, final int position) {
        Estados estado = list.get(position);
        holder.tNome.setText(estado.getNome());
        holder.img.setImageResource(estado.getBandeira());
        if (onClickListener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    onClickListener.onClickEstados(holder, position);
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return this.list != null ? this.list.size() : 0;
    }


    public interface EstadosOnClickListener {
        public void onClickEstados(EstadosViewHolder holder, int id);
    }

    public static class EstadosViewHolder extends RecyclerView.ViewHolder {
        public TextView tNome;
        ImageView img;
        private View view;

        public EstadosViewHolder(@NonNull View itemView) {
            super(itemView);
            this.view = itemView;

            tNome = (TextView) view.findViewById(R.id.tNome);
            img = (ImageView) view.findViewById(R.id.img);
        }
    }

}