package br.com.meuprojeto.dm.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.model.ModelMapaLojas;

public class AdapterMapaLojas extends RecyclerView.Adapter<AdapterMapaLojas.MyViewHolder>{

    // Criei um atributo para ser usado no decorrer do codigo abaixo.
    private List<ModelMapaLojas> mapaLojasAdapter;

    // Metodo construtor da classe AdapterMapaLojas.
    public AdapterMapaLojas(List<ModelMapaLojas> lista) {
        this.mapaLojasAdapter = lista;
    }

    // Metodo abaixo apenas cria a visualização dos itens. Pelo que eu entendi ate o momento,
    // o metodo abaixo traz o layout em xml e converte para um objeto para poder ser usado
    // como referencia para ser instanciado posteriormente.
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

        ModelMapaLojas listaMapaLojas = mapaLojasAdapter.get(i);

        myViewHolder.loja.setText(listaMapaLojas.getLoja());
        myViewHolder.cidade.setText(listaMapaLojas.getCidade());
        myViewHolder.bairro.setText(listaMapaLojas.getBairro());

    }

    // Esse metodo é responsavel por retornar a quantidade de itens que vão ser exibidos.
    @Override
    public int getItemCount() {
        return mapaLojasAdapter.size();
    }

    // Inner class necessario para o funcionamento perfeito do adapter.
    public class MyViewHolder extends RecyclerView.ViewHolder{

        // Na inner class eu criei duas variaveis (que mais abaixo vão fazer referencia
        // aos TextView que tem na tela adapter_mapa_loja.xml
        TextView loja;
        TextView cidade;
        TextView bairro;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            // Apontei as duas variaveis para os view da tela
            loja = itemView.findViewById(R.id.tvLoja);
            cidade = itemView.findViewById(R.id.tvCidade);
            bairro = itemView.findViewById(R.id.tvBairro);

        }
    }

}
