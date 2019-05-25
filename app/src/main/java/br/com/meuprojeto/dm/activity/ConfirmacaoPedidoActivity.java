package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.adapter.ConfirmacaoPedidoAdapter;
import br.com.meuprojeto.dm.model.ConfirmacaoPedidoModel;
import br.com.meuprojeto.dm.outros.RecyclerItemClickListener;

public class ConfirmacaoPedidoActivity extends AppCompatActivity {

    private RecyclerView rvConfirmacaoPedido;
    private List<ConfirmacaoPedidoModel> confirmacaoPedidoActivity = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao_pedido);

        // Apontei a variavel rvConfirmacaoPedido para o recyclerview rvConfirmacaoPedido da tela.
        rvConfirmacaoPedido = findViewById(R.id.rvConfirmacaoPedido);

        // Simulação de Pedido
        this.listaConfirmacaoPedido();

        // Configurando o Adapter (o adapter serve para receber os dados, sejam eles de uma
        // matriz, vetor ou de uma base de dados), apos feito isso o adapter vai tratar os dados
        // e servir como parametro para ser usado posteriormente no ListView.
        ConfirmacaoPedidoAdapter adapter = new ConfirmacaoPedidoAdapter(confirmacaoPedidoActivity);

        // Adicionando o adaptador para a RecyclerView.
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvConfirmacaoPedido.setLayoutManager(layoutManager);
        rvConfirmacaoPedido.setHasFixedSize(true);
        rvConfirmacaoPedido.setAdapter(adapter);

        // Adicionando cliqe na lista
        rvConfirmacaoPedido.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        rvConfirmacaoPedido,
                        new RecyclerItemClickListener.OnItemClickListener() {

                            // Esse metodo é responsavel pelo click unico no item da lista.
                            @Override
                            public void onItemClick(View view, int position) {

                            }

                            // Esse metodo é responsavel pelo click longo no item da lista.
                            @Override
                            public void onLongItemClick(View view, int position) {

                            }

                            //
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );

    }

    // Interação entre a tela CONFIRMAÇÃO PEDIDO e a tela MAIN ACTIVITY
    // através do botão FINALIZAR PEDIDO.
    public void irTelaInicial(View view) {
        Intent irTelaInicial = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(irTelaInicial);
    }

    // Metodo responsavel por simular um pedido que fiz.
    // esse metodo está trabalhando com uma lista engessada. Futuramente quero que
    // essa lista seja alimentada por uma consulta no banco de dados.
    public void listaConfirmacaoPedido(){

        ConfirmacaoPedidoModel listaConfirmacaoPedido = new ConfirmacaoPedidoModel("2", "Arroz tio João", "11,40");
        this.confirmacaoPedidoActivity.add(listaConfirmacaoPedido);

        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("1", "Sabonete", "3,20");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("5", "Shampoo", "5,20");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("2", "Açucar", "6,00");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("3", "Café", "5,00");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("4", "Pão", "1,50");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("6", "Biscoito", "9,25");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("1", "Pizza", "3,10");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("2", "Macarrão", "5,20");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("10", "Molho", "3,20");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("3", "Coca-cola", "11,40");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("2", "Suco", "11,40");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("2", "Feijão", "11,40");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("5", "Maionese", "11,40");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("1", "Cuzcuz", "11,40");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("2", "Ovo", "11,40");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("6", "Leite", "11,40");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);

    }

    public void confirmacao(View view) {
        Intent irTelaInicial = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(irTelaInicial);
    }

}
