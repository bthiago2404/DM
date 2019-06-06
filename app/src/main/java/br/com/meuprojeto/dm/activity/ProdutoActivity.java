package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.meuprojeto.dm.R;

public class ProdutoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);
    }

    public void irTelaLojaSelecionada(View view){
        Intent irTelaLojaSelecionada = new Intent(getApplicationContext(), LojaSelecionadaActivity.class);
        startActivity(irTelaLojaSelecionada);
    }

}
