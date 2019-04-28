package br.com.meuprojeto.dm.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.adapter.LocaisEntregaAdapter;
import br.com.meuprojeto.dm.model.LocaisEntregaModel;

public class LocaisEntregaActivity extends AppCompatActivity {

    private RecyclerView rvLocaisEntrega;
    private List<LocaisEntregaModel> locaisEntregaActivity = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locais_entrega);

        // Apontei a variavel rvLocaisEntrega para o recyclerview rvLocaisEntrega da tela.
        rvLocaisEntrega = findViewById(R.id.rvLocaisEntrega);

        // Listagens de Locais de Entrega
        this.listaLocaisEntrega();

        // Configurando o Adapter (o adapter serve para receber os dados, sejam eles de uma
        // matriz, vetor ou de uma base de dados), apos feito isso o adapter vai tratar os dados
        // e servir como parametro para ser usado posteriormente no ListView.
        LocaisEntregaAdapter adapter = new LocaisEntregaAdapter(locaisEntregaActivity);

        // Adicionando o adaptador para a RecyclerView.
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvLocaisEntrega.setLayoutManager(layoutManager);
        rvLocaisEntrega.setHasFixedSize(true);
        rvLocaisEntrega.setAdapter(adapter);

        // Adicionando cliqe na lista

    }

    // Metodo responsavel por gerenciar a lista de bairros que fazemos entrega.
    // esse metodo está trabalhando com uma lista de bairros engessada. Futuramente quero que
    // essa lista seja alimentada por uma consulta no banco de dados.
    public void listaLocaisEntrega(){

        LocaisEntregaModel listaLocaisEntrega = new LocaisEntregaModel("Presidente Medici");
        this.locaisEntregaActivity.add(listaLocaisEntrega);

        listaLocaisEntrega = new LocaisEntregaModel("Cruzeiro");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Centro");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Malvinas");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Catole");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Nações");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Velame");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Alto Branco");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Gloria");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Ramadinha");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);
        listaLocaisEntrega = new LocaisEntregaModel("Bairro de Teste");
        locaisEntregaActivity.add(listaLocaisEntrega);

    }

}
