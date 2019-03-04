package br.com.meuprojeto.dm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LocalizacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacao);
    }

    // Interação entre tela que informa o CPF com a tela que exibe o mapa de lojas. Acredito que
    // Essa interação não está correta. Porém vou deixar ativa apenas para testes de interações.
    public void mapaLojas(View view) {
        Intent irTelaMapaLojas = new Intent(getApplicationContext(), MapaLojasActivity.class);
        startActivity(irTelaMapaLojas);
    }

}
