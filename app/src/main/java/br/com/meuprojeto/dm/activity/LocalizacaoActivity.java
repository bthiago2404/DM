package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.meuprojeto.dm.R;

public class LocalizacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacao);
    }

    // Interação entre tela LOCALIDADE e a tela MAPA DE LOJAS. Acredito que
    // Essa interação não está correta. Porém vou deixar ativa apenas para testes de interações.
    public void mapaLojas(View view) {
        Intent irTelaMapaLojas = new Intent(getApplicationContext(), MapaLojasActivity.class);
        startActivity(irTelaMapaLojas);
    }

}
