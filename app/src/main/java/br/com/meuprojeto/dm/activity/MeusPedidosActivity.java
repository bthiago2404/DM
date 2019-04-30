package br.com.meuprojeto.dm.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.adapter.MeusPedidosAdapter;
import br.com.meuprojeto.dm.model.MeusPedidosModel;
import br.com.meuprojeto.dm.outros.RecyclerItemClickListener;

public class MeusPedidosActivity extends AppCompatActivity {

    private RecyclerView rvMeusPedidos;
    private List<MeusPedidosModel> meusPedidosActivity = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_pedidos);

        // Apontei a variavel rvMeusPedidos para o recyclerview rvMeusPedidos da tela.
        rvMeusPedidos = findViewById(R.id.rvMeusPedidos);

        // Listagens de Bairros
        this.listaMeusPedidos();

        // Configurando o Adapter (o adapter serve para receber os dados, sejam eles de uma
        // matriz, vetor ou de uma base de dados), apos feito isso o adapter vai tratar os dados
        // e servir como parametro para ser usado posteriormente no ListView.
        MeusPedidosAdapter adapter = new MeusPedidosAdapter(meusPedidosActivity);

        // Adicionando o adaptador para a RecyclerView.
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvMeusPedidos.setLayoutManager(layoutManager);
        rvMeusPedidos.setHasFixedSize(true);
        rvMeusPedidos.setAdapter(adapter);

        // Adicionando cliqe na lista
        rvMeusPedidos.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        rvMeusPedidos,
                        new RecyclerItemClickListener.OnItemClickListener() {

                            // Esse metodo é responsavel pelo click unico no item da lista.
                            @Override
                            public void onItemClick(View view, int position) {

                            }

                            // Esse metodo é responsavel pelo click longo no item da lista.
                            @Override
                            public void onLongItemClick(View view, int position) {
                                MeusPedidosModel meusPedidosModel = meusPedidosActivity.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "" + meusPedidosModel.getData(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            //
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );

    }

    // Metodo responsavel por gerenciar a lista de bairros que eu tenho.
    // esse metodo está trabalhando com uma lista de bairros engessada. Futuramente quero que
    // essa lista seja alimentada por uma consulta no banco de dados.
    public void listaMeusPedidos(){

        MeusPedidosModel listaMeusPedidos = new MeusPedidosModel("Pedido 01","249,50", "30/04/2019", "Dinheiro", "Delivery");
        this.meusPedidosActivity.add(listaMeusPedidos);

        listaMeusPedidos = new MeusPedidosModel("Pedido 02","490,00", "05/05/2019", "Dinheiro", "Buscar Na Loja");
        meusPedidosActivity.add(listaMeusPedidos);
        listaMeusPedidos = new MeusPedidosModel("Pedido 03","490,00", "05/05/2019", "Dinheiro", "Delivery");
        meusPedidosActivity.add(listaMeusPedidos);
        listaMeusPedidos = new MeusPedidosModel("Pedido 04","100,00", "05/06/2019", "Cartão", "Delivery");
        meusPedidosActivity.add(listaMeusPedidos);
        listaMeusPedidos = new MeusPedidosModel("Pedido 05","2900,00", "05/07/2019", "Cartão", "Buscar Na Loja");
        meusPedidosActivity.add(listaMeusPedidos);
        listaMeusPedidos = new MeusPedidosModel("Pedido 06","800,00", "05/08/2019", "Cartão", "Delivery");
        meusPedidosActivity.add(listaMeusPedidos);
        listaMeusPedidos = new MeusPedidosModel("Pedido 07","600,00", "05/09/2019", "Dinheiro", "Delivery");
        meusPedidosActivity.add(listaMeusPedidos);
        listaMeusPedidos = new MeusPedidosModel("Pedido 08","230,00", "05/10/2019", "Cartão", "Delivery");
        meusPedidosActivity.add(listaMeusPedidos);
        listaMeusPedidos = new MeusPedidosModel("Pedido 09","130,00", "05/11/2019", "Dinheiro", "Delivery");
        meusPedidosActivity.add(listaMeusPedidos);
        listaMeusPedidos = new MeusPedidosModel("Pedido 10","89,00", "05/12/2019", "Cartão", "Buscar Na Loja");
        meusPedidosActivity.add(listaMeusPedidos);
        listaMeusPedidos = new MeusPedidosModel("Pedido 11","40,00", "05/01/2020", "Dinheiro", "Delivery");
        meusPedidosActivity.add(listaMeusPedidos);
        listaMeusPedidos = new MeusPedidosModel("Pedido 12","980,00", "05/02/2020", "Cartão", "Delivery");
        meusPedidosActivity.add(listaMeusPedidos);
        listaMeusPedidos = new MeusPedidosModel("Pedido 13","500,00", "05/03/2020", "Cartão", "Buscar Na Loja");
        meusPedidosActivity.add(listaMeusPedidos);

    }

}
