package br.com.meuprojeto.dm.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.model.MainModel;

public class MainAdapter extends  RecyclerView.Adapter<MainAdapter.MyViewHolder>{

    // Criei um atributo para ser usado no decorrer do codigo abaixo.
    private List<MainModel> mainAdapter;

    // Metodo construtor da classe MainAdapter.
    public MainAdapter(List<MainModel> lista) {
        this.mainAdapter = lista;
    }

    // Metodo abaixo apenas cria a visualização dos itens. Pelo que eu entendi ate o momento,
    // o metodo abaixo traz o layout em xml e converte para um objeto para poder ser usado
    // como referencia para ser instanciado posteriormente.
    @NonNull
    @Override
    public MainAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemLista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_main, viewGroup, false);

        return new MainAdapter.MyViewHolder(itemLista);
    }

    // O metodo abaixo é responsavel por fazer a exibição dos items no RecycleView.
    @Override
    public void onBindViewHolder(@NonNull MainAdapter.MyViewHolder myViewHolder, int i) {

        MainModel listaComercios = mainAdapter.get(i);

        myViewHolder.loja.setText(listaComercios.getLoja());
        myViewHolder.tempoEntrega.setText(listaComercios.getTempoEntrega());
        myViewHolder.valorEntrega.setText(listaComercios.getValorEntrega());

    }

    // Esse metodo é responsavel por retornar a quantidade de itens que vão ser exibidos.
    @Override
    public int getItemCount() {
        return mainAdapter.size();
    }

    // Inner class necessario para o funcionamento perfeito do adapter.
    public class MyViewHolder extends RecyclerView.ViewHolder{

        // Na inner class eu criei trez variaveis (que mais abaixo vão fazer referencia
        // aos TextView que tem na tela adapter_main.xml
        TextView loja;
        TextView tempoEntrega;
        TextView valorEntrega;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            // Apontei as duas variaveis para os view da tela
            loja = itemView.findViewById(R.id.tvLoja);
            tempoEntrega = itemView.findViewById(R.id.tvTempoEntrega);
            valorEntrega = itemView.findViewById(R.id.tvValorEntrega);

        }
    }

}
