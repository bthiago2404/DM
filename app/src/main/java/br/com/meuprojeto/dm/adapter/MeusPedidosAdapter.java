package br.com.meuprojeto.dm.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.model.MeusPedidosModel;

public class MeusPedidosAdapter extends RecyclerView.Adapter<MeusPedidosAdapter.MyViewHolder>{

    // Criei um atributo para ser usado no decorrer do codigo abaixo.
    private List<MeusPedidosModel> meusPedidosAdapter;

    // Metodo construtor da classe MeusPedidosAdapter.
    public MeusPedidosAdapter(List<MeusPedidosModel> lista) {
        this.meusPedidosAdapter = lista;
    }

    // Metodo abaixo apenas cria a visualização dos itens. Pelo que eu entendi ate o momento,
    // o metodo abaixo traz o layout em xml e converte para um objeto para poder ser usado
    // como referencia para ser instanciado posteriormente.
    @NonNull
    @Override
    public MeusPedidosAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemLista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_meus_pedidos, viewGroup, false);

        return new MeusPedidosAdapter.MyViewHolder(itemLista);
    }

    // O metodo abaixo é responsavel por fazer a exibição dos items no RecycleView.
    @Override
    public void onBindViewHolder(@NonNull MeusPedidosAdapter.MyViewHolder myViewHolder, int i) {

        MeusPedidosModel listaMeusPedidos = meusPedidosAdapter.get(i);

        myViewHolder.pedido.setText(listaMeusPedidos.getPedido());
        myViewHolder.valor.setText(listaMeusPedidos.getValor());
        myViewHolder.data.setText(listaMeusPedidos.getData());
        myViewHolder.tipoPagamento.setText(listaMeusPedidos.getTipoPagamento());
        myViewHolder.tipoEntrega.setText(listaMeusPedidos.getTipoEntrega());

    }

    // Esse metodo é responsavel por retornar a quantidade de itens que vão ser exibidos.
    @Override
    public int getItemCount() {
        return meusPedidosAdapter.size();
    }

    // Inner class necessario para o funcionamento perfeito do adapter.
    public class MyViewHolder extends RecyclerView.ViewHolder{

        // Na inner class eu criei trez variaveis (que mais abaixo vão fazer referencia
        // aos TextView que tem na tela adapter_meus_pedidos.xml
        TextView pedido;
        TextView valor;
        TextView data;
        TextView tipoPagamento;
        TextView tipoEntrega;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            // Apontei as duas variaveis para os view da tela
            pedido = itemView.findViewById(R.id.tvPedido);
            valor = itemView.findViewById(R.id.tvValorPedido);
            data = itemView.findViewById(R.id.tvDataPedido);
            tipoPagamento = itemView.findViewById(R.id.tvTipoPagamento);
            tipoEntrega = itemView.findViewById(R.id.tvTipoEntrega);

        }
    }

}
