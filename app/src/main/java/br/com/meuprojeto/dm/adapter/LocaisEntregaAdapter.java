package br.com.meuprojeto.dm.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.model.LocaisEntregaModel;

public class LocaisEntregaAdapter extends RecyclerView.Adapter<LocaisEntregaAdapter.MyViewHolder> {

    // Criei um atributo para ser usado no decorrer do codigo abaixo.
    private List<LocaisEntregaModel> locaisEntregaAdapter;

    // Metodo construtor da classe DepartamentosAdapter.
    public LocaisEntregaAdapter(List<LocaisEntregaModel> lista) {
        this.locaisEntregaAdapter = lista;
    }

    // Metodo abaixo apenas cria a visualização dos itens. Pelo que eu entendi ate o momento,
    // o metodo abaixo traz o layout em xml e converte para um objeto para poder ser usado
    // como referencia para ser instanciado posteriormente.
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemLista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_locais_entrega, viewGroup, false);

        return new MyViewHolder(itemLista);
    }

    // O metodo abaixo é responsavel por fazer a exibição dos items no RecycleView.
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        LocaisEntregaModel listaLocaisEntrega = locaisEntregaAdapter.get(i);

        myViewHolder.tvBairro.setText(listaLocaisEntrega.getTvBairro());
    }

    // Esse metodo é responsavel por retornar a quantidade de itens que vão ser exibidos.
    @Override
    public int getItemCount() { return locaisEntregaAdapter.size(); }

    // Inner class necessario para o funcionamento perfeito do adapter.
    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvBairro;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvBairro = itemView.findViewById(R.id.tvBairro);

        }
    }

}
