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
import br.com.meuprojeto.dm.adapter.DepartamentosAdapter;
import br.com.meuprojeto.dm.model.DepartamentosModel;
import br.com.meuprojeto.dm.outros.RecyclerItemClickListener;

public class DepartamentosActivity extends AppCompatActivity {

    private RecyclerView rvDepartamentos;
    private List<DepartamentosModel> departamentosActivity = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departamentos);

        // Apontei a variavel rvDepartamentos para o recyclerview rvDepartamentos da tela.
        rvDepartamentos = findViewById(R.id.rvDepartamentos);

        // Listagens de Departamentos
        this.listaDepartamentos();

        // Configurando o Adapter (o adapter serve para receber os dados, sejam eles de uma
        // matriz, vetor ou de uma base de dados), apos feito isso o adapter vai tratar os dados
        // e servir como parametro para ser usado posteriormente no ListView.
        DepartamentosAdapter adapter = new DepartamentosAdapter(departamentosActivity);

        // Adicionando o adaptador para a RecyclerView.
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvDepartamentos.setLayoutManager(layoutManager);
        rvDepartamentos.setHasFixedSize(true);
        rvDepartamentos.setAdapter(adapter);

        // Adicionando cliqe na lista
        rvDepartamentos.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        rvDepartamentos,
                        new RecyclerItemClickListener.OnItemClickListener() {

                            // Esse metodo é responsavel pelo click unico no item da lista.
                            @Override
                            public void onItemClick(View view, int position) {
                                Intent irTelaDepartamento = new Intent(getApplicationContext(), CategoriasActivity.class);
                                startActivity(irTelaDepartamento);
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

    public void irTelaLocaisDeEntrega(View view) {
        Intent irTelaLocaisDeEntrega = new Intent(getApplicationContext(), LocaisEntregaActivity.class);
        startActivity(irTelaLocaisDeEntrega);
    }

    public void irTelaMeuCarrinho(View view){
        Intent irTelaMeuCarrinho = new Intent(getApplicationContext(), MeuCarrinhoActivity.class);
        startActivity(irTelaMeuCarrinho);
    }

    // Metodo responsavel por gerenciar a lista de departamentos que eu tenho.
    // esse metodo está trabalhando com uma lista de departamentos engessada. Futuramente quero que
    // essa lista seja alimentada por uma consulta no banco de dados.
    public void listaDepartamentos(){

        DepartamentosModel listaDepartamentos = new DepartamentosModel("Alimentos Especiais");
        this.departamentosActivity.add(listaDepartamentos);

        listaDepartamentos = new DepartamentosModel("Bazar");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Bebidas");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Carnes, Aves e Peixes");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Congelados");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Frios e Laticinios");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Higiene e Beleza");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Hortifruti");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Limpeza");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Matinais");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Mercearia");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Padaria");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Pet Shop");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Suplementos");
        departamentosActivity.add(listaDepartamentos);

    }

}
