package br.com.meuprojeto.dm.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.adapter.AdapterMapaLojas;
import br.com.meuprojeto.dm.model.ModelMapaLojas;

public class MapaLojasActivity extends AppCompatActivity {

    // Criei a variavel listLocais do tipo ListView
    private RecyclerView rvMapaLojas;
    private List<ModelMapaLojas> listaBairros = new ArrayList<>();

    // No metodo onCreate eu fiz todos os procedimentos que precisam ser feitos ao iniciar a tela.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_lojas);

        // Apontei a variavel listLocais para o view listLocais da tela.
        rvMapaLojas = findViewById(R.id.rvMapaLojas);

        // Listagens de Bairrox
        this.listaMapaLojas();

        // Configurando o Adapter (o adapter serve para receber os dados, sejam eles de uma
        // matriz, vetor ou de uma base de dados), apos feito isso o adapter vai tratar os dados
        // e servir como parametro para ser usado posteriormente no ListView.
        AdapterMapaLojas adapter = new AdapterMapaLojas(listaBairros);


        // Adicionando o adaptador para a RecyclerView.
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvMapaLojas.setLayoutManager(layoutManager);
        rvMapaLojas.setHasFixedSize(true);
        rvMapaLojas.setAdapter(adapter);

        // Adicionando cliqe na lista

    }

    // Metodo responsavel por gerenciar a lista de bairros que eu tenho.
    // esse metodo está trabalhando com uma lista de bairros engessada. Futuramente quero que
    // essa lista seja alimentada por uma consulta no banco de dados.
    public void listaMapaLojas(){

        ModelMapaLojas listaZonaBairro = new ModelMapaLojas("Zona Norte", "Alto Branco");
        this.listaBairros.add(listaZonaBairro);

        //listaZonaBairro = new ModelMapaLojas("Zona Norte","Alto Branco");
        //listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Alto da Serra");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Araxá");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Bairro das Nações");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Conceição");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Cuités");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Distrito de Jenipapo");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Jardim Continental");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Jardim Menezes");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Jardim Tavares");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Jeremias");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Juracy Palhano");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Lauritzen");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Louzeiro");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Monte Santo");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Novo Bodocongó");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Palmeira");
        listaBairros.add(listaZonaBairro);

        listaZonaBairro = new ModelMapaLojas("Zona Leste","Belo Monte");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Castelo Branco");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Glória");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Jardim América");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Jardim Atalaia");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Jardim Europa");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","José Pinheiro");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Mirante");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Monte Castelo");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Nova Brasília");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Santo Antônio");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Vila Cabral");
        listaBairros.add(listaZonaBairro);

    }

}
