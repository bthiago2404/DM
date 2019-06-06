package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.meuprojeto.dm.R;

public class TipoEntregaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_entrega);
    }

    public void irTelaInicial(View view){
        Intent irTelaInicial = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(irTelaInicial);
    }

}
