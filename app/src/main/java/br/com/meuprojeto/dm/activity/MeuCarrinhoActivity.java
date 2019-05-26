package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.adapter.MeuCarrinhoAdapter;
import br.com.meuprojeto.dm.model.MeuCarrinhoModel;

public class MeuCarrinhoActivity extends AppCompatActivity {

    /*
    //Trecho do codigo referente a logica dos botões de somar e subtrair.
    //Vou deixar como comentario pois essa tela vai ser por meio de Web Services.
    private Button btnAcrescentar;
    private Button btnSubtrair;
    private TextView tvQuantidade;
    private int i;
    */

    private RecyclerView rvMeuCarrinho;
    private List<MeuCarrinhoModel> meuCarrinhoActivity = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meu_carrinho);

    /*
        //Trecho do codigo referente a logica dos botões de somar e subtrair.
        //esse trecho é responsavel por apontar os valores das 3 variaveis citadas acima
        //para cada View da tela MeuCarrinho.
        btnAcrescentar = findViewById(R.id.btnAcrescentar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        tvQuantidade = findViewById(R.id.tvQuantidade);
    */

        // Apontei a variavel rvMeuCarrinho para o recyclerview rvMeuCarrinho da tela.
        rvMeuCarrinho = findViewById(R.id.rvMeuCarrinho);

        // Listagens de Lista Meu Carrinho
        this.listaMeuCarrinho();

        // Configurando o Adapter (o adapter serve para receber os dados, sejam eles de uma
        // matriz, vetor ou de uma base de dados), apos feito isso o adapter vai tratar os dados
        // e servir como parametro para ser usado posteriormente no ListView.
        MeuCarrinhoAdapter adapter = new MeuCarrinhoAdapter(meuCarrinhoActivity);

        // Adicionando o adaptador para a RecyclerView.
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvMeuCarrinho.setLayoutManager(layoutManager);
        rvMeuCarrinho.setHasFixedSize(true);
        rvMeuCarrinho.setAdapter(adapter);

        // Adicionando cliqe na lista

    }

    // Interação entre a tela MEU CARRINHO e a tela CONFIRMAÇÃO DE PEDIDO
    // através do botão FINALIZAR PEDIDO.
    public void confirmacaoPedido(View view) {
        Intent irTelaConfirmacaoPedido = new Intent(getApplicationContext(), ConfirmacaoPedidoActivity.class);
        startActivity(irTelaConfirmacaoPedido);
    }

    public void adicionarMaisItens(View view) {
        Intent irTelaLojaSelecionada = new Intent(getApplicationContext(), LojaSelecionadaActivity.class);
        startActivity(irTelaLojaSelecionada);
    }

    /*
        //Trecho do codigo referente a logica dos botões de somar e subtrair.
        //Vou deixar como comentario pois essa tela vai ser por meio de Web Services.
        public void acrescentarItens(View view) {
            i = i + 1;
            String numero2 = String.valueOf(i);
            tvQuantidade.setText(numero2);
        }

        public void subtrairItens(View view) {
            i = i - 1;
            String numero2 = String.valueOf(i);
            tvQuantidade.setText(numero2);
        }
    */

    // Metodo responsavel por gerenciar a lista de produtos que fazemos entrega.
    // esse metodo está trabalhando com uma lista de produtos engessada. Futuramente quero que
    // essa lista seja alimentada por uma consulta no banco de dados.
    public void listaMeuCarrinho(){

        MeuCarrinhoModel listaMeuCarrinho = new MeuCarrinhoModel("Amac De Roupa Comfort Lv500 Pg400ml Orig", "7,50");
        this.meuCarrinhoActivity.add(listaMeuCarrinho);

        listaMeuCarrinho = new MeuCarrinhoModel("Arroz Chines Parbolizado 5kg", "9,20");
        meuCarrinhoActivity.add(listaMeuCarrinho);
        listaMeuCarrinho = new MeuCarrinhoModel("Atum Gomes Da Costa 170g Solido Natural Light", "9,20");
        meuCarrinhoActivity.add(listaMeuCarrinho);
        listaMeuCarrinho = new MeuCarrinhoModel("Beb Lactea Nestle 200ml Nescau Light", "9,20");
        meuCarrinhoActivity.add(listaMeuCarrinho);
        listaMeuCarrinho = new MeuCarrinhoModel("Bisc Capricche 120g Waffer Laranja", "9,20");
        meuCarrinhoActivity.add(listaMeuCarrinho);
        listaMeuCarrinho = new MeuCarrinhoModel("Agua Mineral Indaia 200ml Copo", "9,20");
        meuCarrinhoActivity.add(listaMeuCarrinho);
        listaMeuCarrinho = new MeuCarrinhoModel("Alface Crespa Und", "9,20");
        meuCarrinhoActivity.add(listaMeuCarrinho);
        listaMeuCarrinho = new MeuCarrinhoModel("Alvejante Brilux Lv5l Pg4,5l Mult", "9,20");
        meuCarrinhoActivity.add(listaMeuCarrinho);
        listaMeuCarrinho = new MeuCarrinhoModel("Amendoim Pippo S 30g S-Pele Torrado", "9,20");
        meuCarrinhoActivity.add(listaMeuCarrinho);
        listaMeuCarrinho = new MeuCarrinhoModel("Ap Barbear Bic Comf 3 Black Night C-1", "9,20");
        meuCarrinhoActivity.add(listaMeuCarrinho);
        listaMeuCarrinho = new MeuCarrinhoModel("Arroz Safra De Ouro Da Terra 1kg", "9,20");
        meuCarrinhoActivity.add(listaMeuCarrinho);
        listaMeuCarrinho = new MeuCarrinhoModel("Aveia Yoki 500g Sachet Em Flocos Finos", "9,20");
        meuCarrinhoActivity.add(listaMeuCarrinho);
        listaMeuCarrinho = new MeuCarrinhoModel("Azeitona Verde Raiola 100g Fatiada", "9,20");
        meuCarrinhoActivity.add(listaMeuCarrinho);
        listaMeuCarrinho = new MeuCarrinhoModel("Barra Cereal Hersheys 66g Cookies-Choc", "9,20");
        meuCarrinhoActivity.add(listaMeuCarrinho);
        listaMeuCarrinho = new MeuCarrinhoModel("Batata Frita 50g Scrusch Ondulada", "9,20");
        meuCarrinhoActivity.add(listaMeuCarrinho);
        listaMeuCarrinho = new MeuCarrinhoModel("Bebida Lactea Cariri 900g Zero Morango", "9,20");
        meuCarrinhoActivity.add(listaMeuCarrinho);
        listaMeuCarrinho = new MeuCarrinhoModel("Bisc Amant Renata 330g Coco", "9,20");
        meuCarrinhoActivity.add(listaMeuCarrinho);

    }

}
