package br.com.meuprojeto.dm.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.meuprojeto.dm.R;

public class AdapterMapaLojas extends RecyclerView.Adapter<AdapterMapaLojas.MyViewHolder>{

    // Metodo abaixo apenas cria a visualização dos itens. Pelo que eu entendi ate o momento,
    // o metodo abaixo traz o layout em xml e converte para um objeto para poder ser usado
    // como referencia.
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemLista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_mapa_lojas, viewGroup, false);

        return new MyViewHolder(itemLista);
    }

    // O metodo abaixo é responsavel por fazer a exibição dos items no RecycleView.
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.zona.setText("Zona de Teste");
        myViewHolder.bairro.setText("Bairro de teste");

    }

    // Esse metodo é responsavel por retornar a quantidade de itens que vão ser exibidos.
    @Override
    public int getItemCount() {
        return 10;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView zona;
        TextView bairro;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            zona = itemView.findViewById(R.id.tvZona);
            bairro = itemView.findViewById(R.id.tvBairro);

        }
    }

}
