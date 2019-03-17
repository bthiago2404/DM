package br.com.meuprojeto.dm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

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

            Intent departamentos = new Intent(MainActivity.this, DepartamentosActivity.class);
            startActivity(departamentos);

        } else if (id == R.id.nav_tipo_entrega) {

            Intent tipoEntrega = new Intent( MainActivity.this, TipoEntregaActivity.class);
            startActivity(tipoEntrega);

        } else if (id == R.id.nav_lista_compras) {

            Intent listaCompras = new Intent(MainActivity.this, ListaComprasActivity.class);
            startActivity(listaCompras);

        } /* else if (id == R.id.nav_mapa_lojas) {

            Intent mapalojas = new Intent(MainActivity.this, MapaLojasActivity.class);
            startActivity(mapalojas);

        } */ else if (id == R.id.nav_como_funciona) {

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
    public void anuncio(View view) {
        Intent irTelaAnuncio = new Intent(getApplicationContext(), AnuncioActivity.class);
        startActivity(irTelaAnuncio);
    }

    public void lojaSelecionada(View view) {
        Intent irTelaLojaSelecionada = new Intent(getApplicationContext(), LojaSelecionadaActivity.class);
        startActivity(irTelaLojaSelecionada);
    }

    public void login(View view) {
        Intent irTelaLogin = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(irTelaLogin);
    }

    public void meusDados(View view) {
        Intent irTelaMeusDados = new Intent(getApplicationContext(), MeusDadosActivity.class);
        startActivity(irTelaMeusDados);
    }

}

