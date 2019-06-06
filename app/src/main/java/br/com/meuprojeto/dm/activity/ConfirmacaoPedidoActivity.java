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
    public void irTelaAvaliacaoEstabelecimento(View view) {
        Intent irTelaAvaliacaoEstabelecimento = new Intent(getApplicationContext(), AvaliacaoEstabelecimentoActivity.class);
        startActivity(irTelaAvaliacaoEstabelecimento);
    }

    // Metodo responsavel por simular um pedido que fiz.
    // esse metodo está trabalhando com uma lista engessada. Futuramente quero que
    // essa lista seja alimentada por uma consulta no banco de dados.
    public void listaConfirmacaoPedido(){

        ConfirmacaoPedidoModel listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Amac De Roupa Comfort Lv500 Pg400ml Orig", "11,40");
        this.confirmacaoPedidoActivity.add(listaConfirmacaoPedido);

        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Arroz Chines Parbolizado 5kg", "3,20");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Atum Gomes Da Costa 170g Solido Natural Light", "5,20");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Beb Lactea Nestle 200ml Nescau Light", "6,00");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Bisc Capricche 120g Waffer Laranja", "5,00");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Agua Mineral Indaia 200ml Copo", "1,50");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Alface Crespa Und", "9,25");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Alvejante Brilux Lv5l Pg4,5l Mult", "3,10");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Amendoim Pippo S 30g S-Pele Torrado", "5,20");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Ap Barbear Bic Comf 3 Black Night C-1", "3,20");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Arroz Safra De Ouro Da Terra 1kg", "11,40");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Aveia Yoki 500g Sachet Em Flocos Finos", "11,40");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Azeitona Verde Raiola 100g Fatiada", "11,40");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Barra Cereal Hersheys 66g Cookies-Choc", "11,40");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Batata Frita 50g Scrusch Ondulada", "11,40");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Bebida Lactea Cariri 900g Zero Morango", "11,40");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);
        listaConfirmacaoPedido = new ConfirmacaoPedidoModel("Bisc Amant Renata 330g Coco", "11,40");
        confirmacaoPedidoActivity.add(listaConfirmacaoPedido);

    }

    public void confirmacao(View view) {
        Intent irTelaInicial = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(irTelaInicial);
    }

}
