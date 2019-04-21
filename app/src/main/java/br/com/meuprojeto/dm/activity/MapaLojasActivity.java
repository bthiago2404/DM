package br.com.meuprojeto.dm.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.adapter.AdapterMapaLojas;
import br.com.meuprojeto.dm.model.ModelMapaLojas;

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

    }

    // Metodo responsavel por gerenciar a lista de bairros que eu tenho.
    // esse metodo está trabalhando com uma lista de bairros engessada. Futuramente quero que
    // essa lista seja alimentada por uma consulta no banco de dados.
    public void listaMapaLojas(){

        ModelMapaLojas listaZonaBairro = new ModelMapaLojas("Zona Norte", "Alto Branco");
        this.mapaLojasActivity.add(listaZonaBairro);

        listaZonaBairro = new ModelMapaLojas("Zona Norte","Alto da Serra");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Araxá");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Bairro das Nações");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Conceição");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Cuités");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Distrito de Jenipapo");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Jardim Continental");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Jardim Menezes");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Jardim Tavares");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Jeremias");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Juracy Palhano");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Lauritzen");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Louzeiro");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Monte Santo");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Novo Bodocongó");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Norte","Palmeira");
        mapaLojasActivity.add(listaZonaBairro);

        listaZonaBairro = new ModelMapaLojas("Zona Leste","Belo Monte");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Castelo Branco");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Glória");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Jardim América");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Jardim Atalaia");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Jardim Europa");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","José Pinheiro");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Mirante");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Monte Castelo");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Nova Brasília");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Santo Antônio");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Leste","Vila Cabral");
        mapaLojasActivity.add(listaZonaBairro);

        listaZonaBairro = new ModelMapaLojas("Zona Sul","Acácio Figueiredo");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Bairro das Cidades");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Catolé");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Catolé de Zé Ferreira");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Conjunto Cinza");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Conjunto Irmãos Alexandrino");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Conjunto Pedro Gondim");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Conjunto Ronaldo Cunha Lima");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Colinas do Sol");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Cruzeiro");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Distrito Industrial");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Distrito dos Mecânicos");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Estação Velha");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Itararé");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Jardim Borborema");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Jardim Paulistano");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Jardim Vitória");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Liberdade");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Ligeiro");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Novo Cruzeiro");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Novo Horizonte");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Palmeira Imperial");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Portal de Campina");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Portal Sudoeste");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Presidente Médici");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Quarenta");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Ressurreição");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Rocha Cavalcante");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Rosa Cruz");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Sandra Cavalcante");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","São José");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Serra da Borborema");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Tambor");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Três Irmãs");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Sul","Velame");
        mapaLojasActivity.add(listaZonaBairro);

        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Bela Vista");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Bodocongó");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Centenário");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Conjunto Chico Mendes");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Conjunto Mariz");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Conjunto Severino Cabral");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Dinamérica");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Jardim Verdejante");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Loteamento Alameda");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Loteamento Grande Campina");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Loteamento João Paulo II");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Loteamento Parque dos Bosques");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Malvinas");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Mutirão do Serrotão");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Novo Bodocongó");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Pedregal");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Prata");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Ramadinha (I e II)");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Santa Cruz");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Santa Rosa");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","São Januário");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Serrotão");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Sítio Lucas (I e II)");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Sítio Estreito (I, II e III)");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Zona Oeste","Universitário");
        mapaLojasActivity.add(listaZonaBairro);

        listaZonaBairro = new ModelMapaLojas("Distritos","Distrito de Catolé");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Distritos","Galante");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Distritos","Marinho");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Distritos","Santa Terezinha");
        mapaLojasActivity.add(listaZonaBairro);
        listaZonaBairro = new ModelMapaLojas("Distritos","São José da Mata");
        mapaLojasActivity.add(listaZonaBairro);

    }

}
