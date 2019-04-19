package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.meuprojeto.dm.R;

public class LojaSelecionadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja_selecionada);
    }

    // Interação entre a tela LOJA SELECIONADA e a tela PRODUTO
    // através do botão que exibe o icone do produto.
    public void produto(View view) {
        Intent irTelaProdutos = new Intent(getApplicationContext(), ProdutoActivity.class);
        startActivity(irTelaProdutos);
    }

}
