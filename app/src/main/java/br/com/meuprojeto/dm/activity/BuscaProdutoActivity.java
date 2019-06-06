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
import br.com.meuprojeto.dm.adapter.BuscaProdutoAdapter;
import br.com.meuprojeto.dm.model.BuscaProdutoModel;
import br.com.meuprojeto.dm.outros.RecyclerItemClickListener;

public class BuscaProdutoActivity extends AppCompatActivity {

    private RecyclerView rvBuscaProduto;
    private List<BuscaProdutoModel> buscaProdutoActivity = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca_produto);

        // Apontei a variavel rvVerMais para o recyclerview rvVerMais da tela.
        rvBuscaProduto = findViewById(R.id.rvBuscaProduto);

        // Listagens de Departamentos
        this.listaBuscaProduto();

        // Configurando o Adapter (o adapter serve para receber os dados, sejam eles de uma
        // matriz, vetor ou de uma base de dados), apos feito isso o adapter vai tratar os dados
        // e servir como parametro para ser usado posteriormente no ListView.
        BuscaProdutoAdapter adapter = new BuscaProdutoAdapter(buscaProdutoActivity);

        // Adicionando o adaptador para a RecyclerView.
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvBuscaProduto.setLayoutManager(layoutManager);
        rvBuscaProduto.setHasFixedSize(true);
        rvBuscaProduto.setAdapter(adapter);

        // Adicionando cliqe na lista
        rvBuscaProduto.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        rvBuscaProduto,
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

    // Metodo responsavel por gerenciar a lista de departamentos que eu tenho.
    // esse metodo está trabalhando com uma lista de departamentos engessada. Futuramente quero que
    // essa lista seja alimentada por uma consulta no banco de dados.
    public void listaBuscaProduto(){

        BuscaProdutoModel listaBuscaProduto = new BuscaProdutoModel("Bisc Oreo 120g", "3.20", "3.20");
        this.buscaProdutoActivity.add(listaBuscaProduto);

        listaBuscaProduto = new BuscaProdutoModel("Bisc Capricche 120g Waffer Laranja", "3.99", "3.99");
        buscaProdutoActivity.add(listaBuscaProduto);
        listaBuscaProduto = new BuscaProdutoModel("Bisc Amant Renata 330g Coco", "8.50", "8.50");
        buscaProdutoActivity.add(listaBuscaProduto);

    }

}
