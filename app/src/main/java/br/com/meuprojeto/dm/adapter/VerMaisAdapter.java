package br.com.meuprojeto.dm.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.model.VerMaisModel;

public class VerMaisAdapter extends RecyclerView.Adapter<VerMaisAdapter.MyViewHolder> {

    // Criei um atributo para ser usado no decorrer do codigo abaixo.
    private List<VerMaisModel> verMaisAdapter;

    // Metodo construtor da classe VerMaisAdapter.
    public VerMaisAdapter(List<VerMaisModel> lista) {
        this.verMaisAdapter = lista;
    }

    // Metodo abaixo apenas cria a visualização dos itens. Pelo que eu entendi ate o momento,
    // o metodo abaixo traz o layout em xml e converte para um objeto para poder ser usado
    // como referencia para ser instanciado posteriormente.
    @NonNull
    @Override
    public VerMaisAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemLista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_ver_mais, viewGroup, false);

        return new VerMaisAdapter.MyViewHolder(itemLista);
    }

    // O metodo abaixo é responsavel por fazer a exibição dos items no RecycleView.
    @Override
    public void onBindViewHolder(@NonNull VerMaisAdapter.MyViewHolder myViewHolder, int i) {

        VerMaisModel listaVerMais = verMaisAdapter.get(i);

        myViewHolder.tvNomeProduto1.setText(listaVerMais.getTvNomeProduto1());
        myViewHolder.tvValorProduto1.setText(listaVerMais.getTvValorProduto1());
        myViewHolder.tvValor1.setText(listaVerMais.getTvValor1());

    }

    // Esse metodo é responsavel por retornar a quantidade de itens que vão ser exibidos.
    @Override
    public int getItemCount() { return verMaisAdapter.size(); }

    // Inner class necessario para o funcionamento perfeito do adapter.
    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvNomeProduto1;
        TextView tvValorProduto1;
        TextView tvValor1;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNomeProduto1 = itemView.findViewById(R.id.tvNomeProduto1);
            tvValorProduto1 = itemView.findViewById(R.id.tvValorProduto1);
            tvValor1 = itemView.findViewById(R.id.tvValor1);

        }
    }

}
