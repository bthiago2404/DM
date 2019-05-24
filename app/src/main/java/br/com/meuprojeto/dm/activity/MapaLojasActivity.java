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
import br.com.meuprojeto.dm.adapter.MapaLojasAdapter;
import br.com.meuprojeto.dm.model.MapaLojasModel;
import br.com.meuprojeto.dm.outros.RecyclerItemClickListener;

public class MapaLojasActivity extends AppCompatActivity {

    private RecyclerView rvMapaLojas;
    private List<MapaLojasModel> mapaLojasActivity = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_lojas);

        // Apontei a variavel rvMapaLojas para o recyclerview rvMapaLojas da tela.
        rvMapaLojas = findViewById(R.id.rvMapaLojas);

        // Listagens de Bairros
        this.listaMapaLojas();

        // Configurando o Adapter (o adapter serve para receber os dados, sejam eles de uma
        // matriz, vetor ou de uma base de dados), apos feito isso o adapter vai tratar os dados
        // e servir como parametro para ser usado posteriormente no ListView.
        MapaLojasAdapter adapter = new MapaLojasAdapter(mapaLojasActivity);

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
                                /*
                                MapaLojasModel mapaLojasModel = mapaLojasActivity.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "" + mapaLojasModel.getLoja(),
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

    // Metodo responsavel por gerenciar a lista de bairros que eu tenho.
    // esse metodo está trabalhando com uma lista de bairros engessada. Futuramente quero que
    // essa lista seja alimentada por uma consulta no banco de dados.
    public void listaMapaLojas(){

        MapaLojasModel listaMapaLojas = new MapaLojasModel("Loja 1", "Campina Grande", "Alto Branco", "(83) 8780-4654");
        this.mapaLojasActivity.add(listaMapaLojas);

        listaMapaLojas = new MapaLojasModel("Hiper Bom Preço", "Campina Grande", "Centro", "(83) 8780-4654");
        mapaLojasActivity.add(listaMapaLojas);
        listaMapaLojas = new MapaLojasModel("Hiper Bom Preço", "Queimadas", "Norte", "(83) 8780-4654");
        mapaLojasActivity.add(listaMapaLojas);
        listaMapaLojas = new MapaLojasModel("Americanas", "João Pessoa", "Centro", "(83) 8780-4654");
        mapaLojasActivity.add(listaMapaLojas);
        listaMapaLojas = new MapaLojasModel("Maxxi Atacado", "João Pessoa", "Praia", "(83) 8780-4654");
        mapaLojasActivity.add(listaMapaLojas);
        listaMapaLojas = new MapaLojasModel("Surubim", "Campina Grande", "Cruzeiro", "(83) 8780-4654");
        mapaLojasActivity.add(listaMapaLojas);

        listaMapaLojas = new MapaLojasModel("Loja 1", "Campina Grande", "Centro", "(83) 8780-4654");
        mapaLojasActivity.add(listaMapaLojas);
        listaMapaLojas = new MapaLojasModel("Loja 1", "Campina Grande", "Centro", "(83) 8780-4654");
        mapaLojasActivity.add(listaMapaLojas);
        listaMapaLojas = new MapaLojasModel("Loja 1", "Campina Grande", "Centro", "(83) 8780-4654");
        mapaLojasActivity.add(listaMapaLojas);
        listaMapaLojas = new MapaLojasModel("Loja 1", "Campina Grande", "Centro", "(83) 8780-4654");
        mapaLojasActivity.add(listaMapaLojas);
        listaMapaLojas = new MapaLojasModel("Loja 1", "Campina Grande", "Centro", "(83) 8780-4654");
        mapaLojasActivity.add(listaMapaLojas);

    }

}
