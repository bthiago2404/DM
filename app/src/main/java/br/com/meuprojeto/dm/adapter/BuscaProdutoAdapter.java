package br.com.meuprojeto.dm.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.model.BuscaProdutoModel;

public class BuscaProdutoAdapter extends RecyclerView.Adapter<BuscaProdutoAdapter.MyViewHolder> {

    // Criei um atributo para ser usado no decorrer do codigo abaixo.
    private List<BuscaProdutoModel> buscaProdutoAdapter;

    // Metodo construtor da classe BuscaProdutoAdapter.
    public BuscaProdutoAdapter(List<BuscaProdutoModel> lista) {
        this.buscaProdutoAdapter = lista;
    }

    // Metodo abaixo apenas cria a visualização dos itens. Pelo que eu entendi ate o momento,
    // o metodo abaixo traz o layout em xml e converte para um objeto para poder ser usado
    // como referencia para ser instanciado posteriormente.
    @NonNull
    @Override
    public BuscaProdutoAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemLista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_busca_produto, viewGroup, false);

        return new BuscaProdutoAdapter.MyViewHolder(itemLista);
    }

    // O metodo abaixo é responsavel por fazer a exibição dos items no RecycleView.
    @Override
    public void onBindViewHolder(@NonNull BuscaProdutoAdapter.MyViewHolder myViewHolder, int i) {

        BuscaProdutoModel listaBuscaProduto = buscaProdutoAdapter.get(i);

        myViewHolder.tvNomeProduto.setText(listaBuscaProduto.getTvNomeProduto());
        myViewHolder.tvValorProduto.setText(listaBuscaProduto.getTvValorProduto());
        myViewHolder.tvValor.setText(listaBuscaProduto.getTvValor());

    }

    // Esse metodo é responsavel por retornar a quantidade de itens que vão ser exibidos.
    @Override
    public int getItemCount() { return buscaProdutoAdapter.size(); }

    // Inner class necessario para o funcionamento perfeito do adapter.
    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvNomeProduto;
        TextView tvValorProduto;
        TextView tvValor;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNomeProduto = itemView.findViewById(R.id.tvNomeProduto);
            tvValorProduto = itemView.findViewById(R.id.tvValorProduto);
            tvValor = itemView.findViewById(R.id.tvValor);

        }
    }

}
