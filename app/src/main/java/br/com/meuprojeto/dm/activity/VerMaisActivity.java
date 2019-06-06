package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.adapter.VerMaisAdapter;
import br.com.meuprojeto.dm.model.VerMaisModel;
import br.com.meuprojeto.dm.outros.RecyclerItemClickListener;

public class VerMaisActivity extends AppCompatActivity {

    private RecyclerView rvVerMais;
    private List<VerMaisModel> verMaisActivity = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_mais);

        // Apontei a variavel rvVerMais para o recyclerview rvVerMais da tela.
        rvVerMais = findViewById(R.id.rvVerMais);

        // Listagens de Departamentos
        this.listaVerMais();

        // Configurando o Adapter (o adapter serve para receber os dados, sejam eles de uma
        // matriz, vetor ou de uma base de dados), apos feito isso o adapter vai tratar os dados
        // e servir como parametro para ser usado posteriormente no ListView.
        VerMaisAdapter adapter = new VerMaisAdapter(verMaisActivity);

        // Adicionando o adaptador para a RecyclerView.
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvVerMais.setLayoutManager(layoutManager);
        rvVerMais.setHasFixedSize(true);
        rvVerMais.setAdapter(adapter);

        // Adicionando cliqe na lista
        rvVerMais.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        rvVerMais,
                        new RecyclerItemClickListener.OnItemClickListener() {

                            // Esse metodo é responsavel pelo click unico no item da lista.
                            @Override
                            public void onItemClick(View view, int position) {
                                Intent irTelaProduto = new Intent(getApplicationContext(), ProdutoActivity.class);
                                startActivity(irTelaProduto);
                            }

                            // Esse metodo é responsavel pelo click longo no item da lista.
                            @Override
                            public void onLongItemClick(View view, int position) {
                                /*
                                DepartamentosModel departamentosModel = departamentosActivity.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "" + departamentosModel.getTvdepartamentos(),
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

    //Metodo responsavel por levar o cliente até a tela do produto.
    //OBS: esse metodo tem que fazer um filtro para levar o cliente para a tela do produto certo.
    public void irTelaLocaisDeEntrega(View view) {
        Intent irTelaLocaisDeEntrega = new Intent(getApplicationContext(), LocaisEntregaActivity.class);
        startActivity(irTelaLocaisDeEntrega);
    }

    public void irTelaMeuCarrinho(View view){
        Intent irTelaMeuCarrinho = new Intent(getApplicationContext(), MeuCarrinhoActivity.class);
        startActivity(irTelaMeuCarrinho);
    }


    // Metodo responsavel por gerenciar a lista de departamentos que eu tenho.
    // esse metodo está trabalhando com uma lista de departamentos engessada. Futuramente quero que
    // essa lista seja alimentada por uma consulta no banco de dados.
    public void listaVerMais(){

        VerMaisModel listaVerMais = new VerMaisModel("Azeitona Verde Raiola 100g Fatiada", "5.99", "5.99");
        this.verMaisActivity.add(listaVerMais);

        listaVerMais = new VerMaisModel("Atum Gomes Da Costa 170g Solido Natural Light", "1.50", "5.99");
        verMaisActivity.add(listaVerMais);
        listaVerMais = new VerMaisModel("Bisc Capricche 120g Waffer Laranja", "3.99", "5.99");
        verMaisActivity.add(listaVerMais);
        listaVerMais = new VerMaisModel("Alface Crespa Und", "3.20", "5.99");
        verMaisActivity.add(listaVerMais);
        listaVerMais = new VerMaisModel("Amendoim Pippo S 30g S-Pele Torrado", "0.80", "0.80");
        verMaisActivity.add(listaVerMais);
        listaVerMais = new VerMaisModel("Arroz Safra De Ouro Da Terra 1kg", "5.20", "5.20");
        verMaisActivity.add(listaVerMais);
        listaVerMais = new VerMaisModel("Azeitona Verde Raiola 100g Fatiada", "5.99", "5.99");
        verMaisActivity.add(listaVerMais);
        listaVerMais = new VerMaisModel("Barra Cereal Hersheys 66g Cookies-Choc", "10.00", "10.00");
        verMaisActivity.add(listaVerMais);
        listaVerMais = new VerMaisModel("Bebida Lactea Cariri 900g Zero Morango", "5.99", "5.99");
        verMaisActivity.add(listaVerMais);
        listaVerMais = new VerMaisModel("Beb Lactea Nestle 200ml Nescau Light", "8.99", "8.99");
        verMaisActivity.add(listaVerMais);
        listaVerMais = new VerMaisModel("Agua Mineral Indaia 200ml Copo", "8.99", "8.99");
        verMaisActivity.add(listaVerMais);
        listaVerMais = new VerMaisModel("Alvejante Brilux Lv5l Pg4,5l Mult", "8.99", "8.99");
        verMaisActivity.add(listaVerMais);
        listaVerMais = new VerMaisModel("Ap Barbear Bic Comf 3 Black Night C-1", "8.99", "8.99");
        verMaisActivity.add(listaVerMais);
        listaVerMais = new VerMaisModel("Aveia Yoki 500g Sachet Em Flocos Finos", "8.99", "8.99");
        verMaisActivity.add(listaVerMais);
        listaVerMais = new VerMaisModel("Feijão Preto tip 1", "8.99", "8.99");
        verMaisActivity.add(listaVerMais);
        listaVerMais = new VerMaisModel("Batata Frita 50g Scrusch Ondulada", "8.99", "8.99");
        verMaisActivity.add(listaVerMais);
        listaVerMais = new VerMaisModel("Bisc Amant Renata 330g Coco", "8.99", "8.99");
        verMaisActivity.add(listaVerMais);

    }

}
