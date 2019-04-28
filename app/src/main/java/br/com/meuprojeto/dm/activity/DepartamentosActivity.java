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
                                //Intent irTelaLojaSelecionada = new Intent(getApplicationContext(), LojaSelecionadaActivity.class);
                                //startActivity(irTelaLojaSelecionada);
                            }

                            // Esse metodo é responsavel pelo click longo no item da lista.
                            @Override
                            public void onLongItemClick(View view, int position) {
                                DepartamentosModel departamentosModel = departamentosActivity.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "" + departamentosModel.getTvdepartamentos(),
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
    public void listaDepartamentos(){

        DepartamentosModel listaDepartamentos = new DepartamentosModel("Ex de Departamento 1");
        this.departamentosActivity.add(listaDepartamentos);

        listaDepartamentos = new DepartamentosModel("Ex de departamento 2");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Ex de departamento 3");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Ex de departamento 4");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Ex de departamento 5");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Ex de departamento 6");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Ex de departamento 7");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Ex de departamento 8");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Ex de departamento 9");
        departamentosActivity.add(listaDepartamentos);
        listaDepartamentos = new DepartamentosModel("Ex de departamento 10");
        departamentosActivity.add(listaDepartamentos);


    }


}
