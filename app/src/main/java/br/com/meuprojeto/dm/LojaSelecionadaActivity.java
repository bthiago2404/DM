package br.com.meuprojeto.dm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LojaSelecionadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja_selecionada);
    }

    public void produto(View view) {
        Intent irTelaProdutos = new Intent(getApplicationContext(), ProdutoActivity.class);
        startActivity(irTelaProdutos);
    }

}
