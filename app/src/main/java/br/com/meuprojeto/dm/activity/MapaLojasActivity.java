package br.com.meuprojeto.dm.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.adapter.AdapterMapaLojas;

public class MapaLojasActivity extends AppCompatActivity {

    // Criei a variavel listLocais do tipo ListView
    private RecyclerView rvMapaLojas;
    // Criei uma variavel String como um array para armazenar varias palavras.
    private String[] bairros = {
            "Alto Branco", "Alto da Serra", "Araxá", "Bairro das Nações", "Conceição", "Cuités",
            "Distrito de Jenipapo", "Jardim Continental", "Jardim Menezes", "Jardim Tavares",
            "Jeremias", "Juracy Palhano", "Lauritzen", "Louzeiro", "Monte Santo", "Novo Bodocongó",
            "Palmeira", "Belo Monte", "Castelo Branco", "Glória", "Jardim América", "Jardim Atalaia",
            "Jardim Europa", "José Pinheiro", "Mirante", "Monte Castelo", "Nova Brasília", "Santo Antônio",
            "Vila Cabral", "Acácio Figueiredo", "Bairro das Cidades", "Catolé", "Catolé de Zé Ferreira",
            "Conjunto Cinza", "Conjunto Irmãos Alexandrino", "Conjunto Pedro Gondim",
            "Conjunto Ronaldo Cunha Lima", "Colinas do Sol", "Cruzeiro", "Distrito Industrial",
            "Distrito dos Mecânicos", "Estação Velha", "Itararé", "Jardim Borborema", "Jardim Paulistano",
            "Jardim Vitória", "Liberdade", "Ligeiro", "Novo Cruzeiro", "Novo Horizonte", "Palmeira Imperial",
            "Portal de Campina", "Portal Sudoeste", "Presidente Médici", "Quarenta", "Ressurreição (I e II)",
            "Rocha Cavalcante", "Rosa Cruz", "Sandra Cavalcante", "São José", "Serra da Borborema",
            "Tambor", "Três Irmãs", "Velame", "Bela Vista", "Bodocongó", "Centenário", "Conjunto Chico Mendes",
            "Conjunto Mariz", "Conjunto Severino Cabral", "Dinamérica", "Jardim Verdejante",
            "Loteamento Alameda", "Loteamento Grande Campina", "Loteamento João Paulo II",
            "Loteamento Parque dos Bosques", "Malvinas", "Mutirão do Serrotão", "Novo Bodocongó",
            "Pedregal", "Prata", "Ramadinha (I e II)", "Santa Cruz", "Santa Rosa", "São Januário",
            "Serrotão", "Sítio Lucas (I e II)", "Sítio Estreito (I, II e III)", "Universitário"
    };

    // No metodo onCreate eu fiz todos os procedimentos que precisam ser feitos ao iniciar a tela.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_lojas);

        // Apontei a variavel listLocais para o view listLocais da tela.
        rvMapaLojas = findViewById(R.id.rvMapaLojas);

        // Configurando o Adapter (o adapter serve para receber os dados, sejam eles de uma
        // matriz, vetor ou de uma base de dados), apos feito isso o adapter vai tratar os dados
        // e servir como parametro para ser usado posteriormente no ListView.
        AdapterMapaLojas adapter = new AdapterMapaLojas();


        // Adicionando o adaptador para a RecyclerView.
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvMapaLojas.setLayoutManager(layoutManager);
        rvMapaLojas.setHasFixedSize(true);
        rvMapaLojas.setAdapter(adapter);


        // Adicionando cliqe na lista


    }

}
