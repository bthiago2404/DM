package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.adapter.LojaSelecionadaAdapter;
import br.com.meuprojeto.dm.model.LojaSelecionadaModel;
import br.com.meuprojeto.dm.outros.RecyclerItemClickListener;

public class LojaSelecionadaActivity extends AppCompatActivity {

    private RecyclerView rvLojaSelecionada;
    private List<LojaSelecionadaModel> lojaSelecionadaActivity = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja_selecionada);

        // Apontei a variavel rvLojaSelecionada para o recyclerview rvLojaSelecionada da tela.
        rvLojaSelecionada = findViewById(R.id.rvLojaSelecionada);
        // Listagens de Departamentos
        this.listaLojaSelecionada();

        // Configurando o Adapter (o adapter serve para receber os dados, sejam eles de uma
        // matriz, vetor ou de uma base de dados), apos feito isso o adapter vai tratar os dados
        // e servir como parametro para ser usado posteriormente no ListView.
        LojaSelecionadaAdapter adapter = new LojaSelecionadaAdapter(lojaSelecionadaActivity);

        // Adicionando o adaptador para a RecyclerView.
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvLojaSelecionada.setLayoutManager(layoutManager);
        rvLojaSelecionada.setHasFixedSize(true);
        rvLojaSelecionada.setAdapter(adapter);

        // Adicionando cliqe na lista
        rvLojaSelecionada.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        rvLojaSelecionada,
                        new RecyclerItemClickListener.OnItemClickListener() {

                            // Esse metodo é responsavel pelo click unico no item da lista.
                            @Override
                            public void onItemClick(View view, int position) {
                                Intent irTelaProduto = new Intent(getApplicationContext(), ProdutoActivity.class);
                                startActivity(irTelaProduto);
                            }

                            // Esse metodo é responsavel pelo click longo no item da lista.
                            @Override
                            public void onLongItemClick(View view, int position) {
                                /*
                                DepartamentosModel departamentosModel = departamentosActivity.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "" + departamentosModel.getTvdepartamentos(),
                                        Toast.LENGTH_SHORT
                                ).show();
                                */
                            }

                            //
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );

    }

    //Metodo responsavel por levar o cliente até a tela do produto.
    //OBS: esse metodo tem que fazer um filtro para levar o cliente para a tela do produto certo.
    public void irTelaLocaisDeEntrega(View view) {
        Intent irTelaLocaisDeEntrega = new Intent(getApplicationContext(), LocaisEntregaActivity.class);
        startActivity(irTelaLocaisDeEntrega);
    }

    public void irTelaMeuCarrinho(View view){
        Intent irTelaMeuCarrinho = new Intent(getApplicationContext(), MeuCarrinhoActivity.class);
        startActivity(irTelaMeuCarrinho);
    }

    public void irTelaBuscaProduto(View view){
        Intent irTelaBuscaProduto = new Intent(getApplicationContext(), BuscaProdutoActivity.class);
        startActivity(irTelaBuscaProduto);
    }

    public void irTelaDepartamentos(View view){
        Intent irTelaDepartamentos = new Intent(getApplicationContext(), DepartamentosActivity.class);
        startActivity(irTelaDepartamentos);
    }

    public void irTelaVerMais(View view){
        Intent irTelaVerMais = new Intent(getApplicationContext(), VerMaisActivity.class);
        startActivity(irTelaVerMais);
    }

    // Metodo responsavel por gerenciar a lista de departamentos que eu tenho.
    // esse metodo está trabalhando com uma lista de departamentos engessada. Futuramente quero que
    // essa lista seja alimentada por uma consulta no banco de dados.
    public void listaLojaSelecionada(){

        LojaSelecionadaModel listaLojaSelecionada = new LojaSelecionadaModel("Azeitona Verde Raiola 100g Fatiada", "5.99", "5.99");
        this.lojaSelecionadaActivity.add(listaLojaSelecionada);

        listaLojaSelecionada = new LojaSelecionadaModel("Atum Gomes Da Costa 170g Solido Natural Light", "1.50", "5.99");
        lojaSelecionadaActivity.add(listaLojaSelecionada);
        listaLojaSelecionada = new LojaSelecionadaModel("Bisc Capricche 120g Waffer Laranja", "3.99", "5.99");
        lojaSelecionadaActivity.add(listaLojaSelecionada);
        listaLojaSelecionada = new LojaSelecionadaModel("Alface Crespa Und", "3.20", "5.99");
        lojaSelecionadaActivity.add(listaLojaSelecionada);
        listaLojaSelecionada = new LojaSelecionadaModel("Amendoim Pippo S 30g S-Pele Torrado", "0.80", "0.80");
        lojaSelecionadaActivity.add(listaLojaSelecionada);

    }

}
