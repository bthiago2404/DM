package br.com.meuprojeto.dm.activity;

import android.content.Intent;
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
import br.com.meuprojeto.dm.adapter.CategoriasAdapter;
import br.com.meuprojeto.dm.model.CategoriasModel;
import br.com.meuprojeto.dm.outros.RecyclerItemClickListener;

public class CategoriasActivity extends AppCompatActivity {

    private RecyclerView rvCategorias;
    private List<CategoriasModel> categoriasActivity = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

        // Apontei a variavel rvCategorias para o recyclerview rvCategorias da tela.
        rvCategorias = findViewById(R.id.rvCategorias);

        // Listagens de Categorias
        this.listaCategorias();

        // Configurando o Adapter (o adapter serve para receber os dados, sejam eles de uma
        // matriz, vetor ou de uma base de dados), apos feito isso o adapter vai tratar os dados
        // e servir como parametro para ser usado posteriormente no ListView.
        CategoriasAdapter adapter = new CategoriasAdapter(categoriasActivity);

        // Adicionando o adaptador para a RecyclerView.
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvCategorias.setLayoutManager(layoutManager);
        rvCategorias.setHasFixedSize(true);
        rvCategorias.setAdapter(adapter);

        // Adicionando cliqe na lista
        rvCategorias.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        rvCategorias,
                        new RecyclerItemClickListener.OnItemClickListener() {

                            // Esse metodo é responsavel pelo click unico no item da lista.
                            @Override
                            public void onItemClick(View view, int position) {
                                Intent irTelaVerMais = new Intent(getApplicationContext(), VerMaisActivity.class);
                                startActivity(irTelaVerMais);
                            }

                            // Esse metodo é responsavel pelo click longo no item da lista.
                            @Override
                            public void onLongItemClick(View view, int position) {
                                /*
                                CategoriasModel categoriasModel = categoriasActivity.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "" + categoriasModel.getTvCategoria(),
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

    public void irTelaLocaisDeEntrega(View view) {
        Intent irTelaLocaisDeEntrega = new Intent(getApplicationContext(), LocaisEntregaActivity.class);
        startActivity(irTelaLocaisDeEntrega);
    }

    public void irTelaMeuCarrinho(View view){
        Intent irTelaMeuCarrinho = new Intent(getApplicationContext(), MeuCarrinhoActivity.class);
        startActivity(irTelaMeuCarrinho);
    }

    // Metodo responsavel por gerenciar a lista de categorias que eu tenho.
    // esse metodo está trabalhando com uma lista de categorias engessada. Futuramente quero que
    // essa lista seja alimentada por uma consulta no banco de dados.
    public void listaCategorias () {

        CategoriasModel listaCategorias = new CategoriasModel("Alimentos Basicos");
        this.categoriasActivity.add(listaCategorias);

        listaCategorias = new CategoriasModel("Biscoitos e Salgadinhos");
        this.categoriasActivity.add(listaCategorias);
        listaCategorias = new CategoriasModel("Bomboniere");
        categoriasActivity.add(listaCategorias);
        listaCategorias = new CategoriasModel("Conservas e Enlatados");
        categoriasActivity.add(listaCategorias);
        listaCategorias = new CategoriasModel("Doces e Sobremesas");
        categoriasActivity.add(listaCategorias);
        listaCategorias = new CategoriasModel("Graos e Farinaceos");
        categoriasActivity.add(listaCategorias);
        listaCategorias = new CategoriasModel("Massas e Molhos");
        categoriasActivity.add(listaCategorias);
        listaCategorias = new CategoriasModel("Temperos e Condimentos");
        categoriasActivity.add(listaCategorias);
        listaCategorias = new CategoriasModel("Outros");
        categoriasActivity.add(listaCategorias);
        listaCategorias = new CategoriasModel("Resto");
        categoriasActivity.add(listaCategorias);

    }

}
