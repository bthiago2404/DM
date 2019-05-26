package br.com.meuprojeto.dm.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.model.ConfirmacaoPedidoModel;

public class ConfirmacaoPedidoAdapter extends RecyclerView.Adapter<ConfirmacaoPedidoAdapter.MyViewHolder>{

    // Criei um atributo para ser usado no decorrer do codigo abaixo.
    private List<ConfirmacaoPedidoModel> confirmacaoPedidoAdapter;

    // Metodo construtor da classe ConfirmacaoPedidoAdapter.
    public ConfirmacaoPedidoAdapter(List<ConfirmacaoPedidoModel> lista) {
        this.confirmacaoPedidoAdapter = lista;
    }

    // Metodo abaixo apenas cria a visualização dos itens. Pelo que eu entendi ate o momento,
    // o metodo abaixo traz o layout em xml e converte para um objeto para poder ser usado
    // como referencia para ser instanciado posteriormente.
    @NonNull
    @Override
    public ConfirmacaoPedidoAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemLista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_confirmacao_pedido, viewGroup, false);

        return new ConfirmacaoPedidoAdapter.MyViewHolder(itemLista);
    }

    // O metodo abaixo é responsavel por fazer a exibição dos items no RecycleView.
    @Override
    public void onBindViewHolder(@NonNull ConfirmacaoPedidoAdapter.MyViewHolder myViewHolder, int i) {

        ConfirmacaoPedidoModel listaConfirmacaoPedido = confirmacaoPedidoAdapter.get(i);

        //myViewHolder.quantidadeItem.setText(listaConfirmacaoPedido.getQuantidadeItem());
        myViewHolder.nomeItem.setText(listaConfirmacaoPedido.getNomeItem());
        myViewHolder.valorItem.setText(listaConfirmacaoPedido.getValorItem());

    }

    // Esse metodo é responsavel por retornar a quantidade de itens que vão ser exibidos.
    @Override
    public int getItemCount() {
        return confirmacaoPedidoAdapter.size();
    }

    // Inner class necessario para o funcionamento perfeito do adapter.
    public class MyViewHolder extends RecyclerView.ViewHolder{

        // Na inner class eu criei trez variaveis (que mais abaixo vão fazer referencia
        // aos TextView que tem na tela adapter_meus_pedidos.xml
        //TextView quantidadeItem;
        TextView nomeItem;
        TextView valorItem;
      //TextView quantidadeTotalItem;
      //TextView valorTotal;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            // Apontei as duas variaveis para os view da tela
            //quantidadeItem = itemView.findViewById(R.id.tvQuantidadeItem);
            nomeItem = itemView.findViewById(R.id.tvNomeItem);
            valorItem = itemView.findViewById(R.id.tvValorItem);

        }
    }

}
