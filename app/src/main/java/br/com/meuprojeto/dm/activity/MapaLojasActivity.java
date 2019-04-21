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

        listaZonaBairro = new ModelMapaLojas("Zona Sul","Acácio Figueiredo");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Bairro das Cidades");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Catolé");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Catolé de Zé Ferreira");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Conjunto Cinza");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Conjunto Irmãos Alexandrino");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Conjunto Pedro Gondim");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Conjunto Ronaldo Cunha Lima");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Colinas do Sol");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Cruzeiro");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Distrito Industrial");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Distrito dos Mecânicos");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Estação Velha");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Itararé");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Jardim Borborema");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Jardim Paulistano");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Jardim Vitória");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Liberdade");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Ligeiro");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Novo Cruzeiro");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Novo Horizonte");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Palmeira Imperial");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Portal de Campina");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Portal Sudoeste");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Presidente Médici");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Quarenta");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Ressurreição");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Rocha Cavalcante");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Rosa Cruz");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Sandra Cavalcante");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","São José");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Serra da Borborema");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Tambor");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Três Irmãs");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Velame");
        listaBairros.add(listaZonaBairro);

        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Bela Vista");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Bodocongó");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Centenário");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Conjunto Chico Mendes");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Conjunto Mariz");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Conjunto Severino Cabral");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Dinamérica");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Jardim Verdejante");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Loteamento Alameda");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Loteamento Grande Campina");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Loteamento João Paulo II");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Loteamento Parque dos Bosques");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Malvinas");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Mutirão do Serrotão");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Novo Bodocongó");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Pedregal");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Prata");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Ramadinha (I e II)");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Santa Cruz");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Santa Rosa");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","São Januário");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Serrotão");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Sítio Lucas (I e II)");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Sítio Estreito (I, II e III)");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Universitário");
        listaBairros.add(listaZonaBairro);

        listaZonaBairro = new ModelMapaLojas("Distritos","Distrito de Catolé");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Distritos","Galante");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Distritos","Marinho");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Distritos","Santa Terezinha");
        listaBairros.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Distritos","São José da Mata");
        listaBairros.add(listaZonaBairro);

    }

}
