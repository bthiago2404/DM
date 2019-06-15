package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.adapter.MainAdapter;
import br.com.meuprojeto.dm.model.MainModel;
import br.com.meuprojeto.dm.outros.RecyclerItemClickListener;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView rvMain;
    private List<MainModel> mainActivity = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // Apontei a variavel rvMain para o recyclerview rvMain da tela.
        rvMain = findViewById(R.id.rvMain);

        // Listagens de Mercados
        this.listaComercios();

        // Configurando o Adapter (o adapter serve para receber os dados, sejam eles de uma
        // matriz, vetor ou de uma base de dados), apos feito isso o adapter vai tratar os dados
        // e servir como parametro para ser usado posteriormente no ListView.
        MainAdapter adapter = new MainAdapter(mainActivity);

        // Adicionando o adaptador para a RecyclerView.
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvMain.setLayoutManager(layoutManager);
        rvMain.setHasFixedSize(true);
        rvMain.setAdapter(adapter);

        // Adicionando cliqe na lista
        rvMain.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        rvMain,
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
                                MainModel mainModel = mainActivity.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "" + mainModel.getLoja(),
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

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    // Botão superior direito foi desativado por falta de necessidade do mesmo.
    // antes de ser desativado ele estava com a opção de ativar gps, porém não tinha sido configurado.
    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_inicio) {
            // Handle the camera action
        } else if (id == R.id.nav_carrinho) {

            Intent meuCarrinho = new Intent(MainActivity.this, MeuCarrinhoActivity.class);
            startActivity(meuCarrinho);

        } /* else if (id == R.id.nav_promocoes) {

            // Falta fazer a tela promoções.
            // Não sei se farei!

        } */ else if (id == R.id.nav_meus_pedidos) {

            Intent meusPedidos = new Intent(MainActivity.this, MeusPedidosActivity.class);
            startActivity(meusPedidos);

        } else if (id == R.id.nav_departamentos) {

            //Intent departamentos = new Intent(MainActivity.this, DepartamentosActivity.class);
            //startActivity(departamentos);
            Toast.makeText(getApplicationContext(),"Escolha um mercado primeiro, para poder ver seus departamentos!", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_tipo_entrega) {

            Intent tipoEntrega = new Intent( MainActivity.this, TipoEntregaActivity.class);
            startActivity(tipoEntrega);

        } else if (id == R.id.nav_lista_compras) {

            Intent listaCompras = new Intent(MainActivity.this, ListaComprasActivity.class);
            startActivity(listaCompras);

        } else if (id == R.id.nav_mapa_lojas) {

            Intent mapalojas = new Intent(MainActivity.this, MapaLojasActivity.class);
            startActivity(mapalojas);

        } else if (id == R.id.nav_como_funciona) {

            Intent comoFunciona = new Intent(MainActivity.this, ComoFuncionaActivity.class);
            startActivity(comoFunciona);

        } else if (id == R.id.nav_solicite_loja) {

            Intent soliciteLoja = new Intent(MainActivity.this, SolicitarLojaTesteActivity.class);
            startActivity(soliciteLoja);

        } else if (id == R.id.nav_central_atendimento) {

            Intent centralAtendimentos = new Intent(MainActivity.this, CentralAtendimentoActivity.class);
            startActivity(centralAtendimentos);

        } else if (id == R.id.nav_politica_privacidade) {

            Intent policitaPrivacidade = new Intent(MainActivity.this, PoliticaPrivacidadeActivity.class);
            startActivity(policitaPrivacidade);

        } else if (id == R.id.nav_configuracoes) {

            Intent configurações = new Intent(MainActivity.this, ConfiguracoesActivity.class);
            startActivity(configurações);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    // Inicio das interações entre telas:
    public void login(View view) {
        Intent irTelaLogin = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(irTelaLogin);
    }

    public void meusDados(View view) {
        Intent irTelaMeusDados = new Intent(getApplicationContext(), MeusDadosActivity.class);
        startActivity(irTelaMeusDados);
    }

    // Metodo responsavel por gerenciar a lista de Mercados que eu tenho.
    // esse metodo está trabalhando com uma lista de mercados engessada. Futuramente quero que
    // essa lista seja alimentada por uma consulta no banco de dados.
    public void listaComercios(){


        MainModel listaComercios = new MainModel("Menor Preço", "45-55 min", "Entrega R$5.99");
        this.mainActivity.add(listaComercios);

        listaComercios = new MainModel("Hiper Bom Preço", "60-120 min", "Entrega R$ 10,00");
        mainActivity.add(listaComercios);
        listaComercios = new MainModel("Ideal", "25-35 min", "Entrega R$ 15.00");
        mainActivity.add(listaComercios);
        listaComercios = new MainModel("Rede Compras", "15-25 min", "Entrega R$ 7.00");
        mainActivity.add(listaComercios);
        listaComercios = new MainModel("Maxxi", "45-55 min", "Entrega R$ 0.00");
        mainActivity.add(listaComercios);
        listaComercios = new MainModel("Atacarejo", "40-100 min", "Entrega R$ 5.99");
        mainActivity.add(listaComercios);
        listaComercios = new MainModel("Atacadão", "30-55 min", "Entrega R$ 5.99");
        mainActivity.add(listaComercios);
        listaComercios = new MainModel("Makro", "10-15 min", "Entrega R$ 5.99");
        mainActivity.add(listaComercios);
        listaComercios = new MainModel("Carefour", "45-60 min", "Entrega R$ 5.99");
        mainActivity.add(listaComercios);
        listaComercios = new MainModel("Açai Atacadista", "30-45 min", "Entrega R$ 5.99");
        mainActivity.add(listaComercios);
        listaComercios = new MainModel("Rede Compras Loja 2", "120-240 min", "Entrega R$ 5.99");
        mainActivity.add(listaComercios);
        listaComercios = new MainModel("Rede Bairro", "5-10 min", "Entrega R$ 5.99");
        mainActivity.add(listaComercios);
        listaComercios = new MainModel("Mercado José", "10-20 min", "Entrega R$ 5.99");
        mainActivity.add(listaComercios);
        listaComercios = new MainModel("Mercado Maria", "15-30 min", "Entrega R$ 5.99");
        mainActivity.add(listaComercios);

    }

}
