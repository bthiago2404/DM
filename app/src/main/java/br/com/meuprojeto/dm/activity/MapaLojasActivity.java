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
import br.com.meuprojeto.dm.adapter.AdapterMapaLojas;
import br.com.meuprojeto.dm.model.ModelMapaLojas;
import br.com.meuprojeto.dm.outros.RecyclerItemClickListener;

public class MapaLojasActivity extends AppCompatActivity {

    // Criei as variaveis. A RecycleView serve para apontar pro RecyclerView da tela adapter_mapa_lojas.xml
    // e a variavel List<ModelMapaLojas> serve como um ArrayList para receber a lista de bairros.
    private RecyclerView rvMapaLojas;
    private List<ModelMapaLojas> mapaLojasActivity = new ArrayList<>();

    // No metodo onCreate eu fiz todos os procedimentos que precisam ser feitos ao iniciar a tela.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_lojas);

        // Apontei a variavel listLocais para o view listLocais da tela.
        rvMapaLojas = findViewById(R.id.rvMapaLojas);

        // Listagens de Bairros
        this.listaMapaLojas();

        // Configurando o Adapter (o adapter serve para receber os dados, sejam eles de uma
        // matriz, vetor ou de uma base de dados), apos feito isso o adapter vai tratar os dados
        // e servir como parametro para ser usado posteriormente no ListView.
        AdapterMapaLojas adapter = new AdapterMapaLojas(mapaLojasActivity);

        // Adicionando o adaptador para a RecyclerView.
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvMapaLojas.setLayoutManager(layoutManager);
        rvMapaLojas.setHasFixedSize(true);
        rvMapaLojas.setAdapter(adapter);

        // Adicionando cliqe na lista
        rvMapaLojas.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        rvMapaLojas,
                        new RecyclerItemClickListener.OnItemClickListener() {

                            // Esse metodo é responsavel pelo click unico no item da lista.
                            @Override
                            public void onItemClick(View view, int position) {
                                Intent irTelaLojaSelecionada = new Intent(getApplicationContext(), LojaSelecionadaActivity.class);
                                startActivity(irTelaLojaSelecionada);
                            }

                            // Esse metodo é responsavel pelo click longo no item da lista.
                            @Override
                            public void onLongItemClick(View view, int position) {
                                ModelMapaLojas modelMapaLojas = mapaLojasActivity.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "" + modelMapaLojas.getLoja(),
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
    public void listaMapaLojas(){

        ModelMapaLojas listaMapaLojas = new ModelMapaLojas("Loja 1", "Campina Grande", "Alto Branco");
        this.mapaLojasActivity.add(listaMapaLojas);

        listaMapaLojas = new ModelMapaLojas("Hiper Bom Preço", "Campina Grande", "Centro");
        mapaLojasActivity.add(listaMapaLojas);
        listaMapaLojas = new ModelMapaLojas("Hiper Bom Preço", "Queimadas", "Norte");
        mapaLojasActivity.add(listaMapaLojas);
        listaMapaLojas = new ModelMapaLojas("Americanas", "João Pessoa", "Centro");
        mapaLojasActivity.add(listaMapaLojas);
        listaMapaLojas = new ModelMapaLojas("Maxxi Atacado", "João Pessoa", "Praia");
        mapaLojasActivity.add(listaMapaLojas);
        listaMapaLojas = new ModelMapaLojas("Surubim", "Campina Grande", "Cruzeiro");
        mapaLojasActivity.add(listaMapaLojas);

        listaMapaLojas = new ModelMapaLojas("Loja 1", "Campina Grande", "Centro");
        mapaLojasActivity.add(listaMapaLojas);
        listaMapaLojas = new ModelMapaLojas("Loja 1", "Campina Grande", "Centro");
        mapaLojasActivity.add(listaMapaLojas);
        listaMapaLojas = new ModelMapaLojas("Loja 1", "Campina Grande", "Centro");
        mapaLojasActivity.add(listaMapaLojas);
        listaMapaLojas = new ModelMapaLojas("Loja 1", "Campina Grande", "Centro");
        mapaLojasActivity.add(listaMapaLojas);
        listaMapaLojas = new ModelMapaLojas("Loja 1", "Campina Grande", "Centro");
        mapaLojasActivity.add(listaMapaLojas);

    }

}
