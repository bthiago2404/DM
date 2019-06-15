package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.com.meuprojeto.dm.R;

public class TipoEntregaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_entrega);
    }

    public void irTelaInicial(View view){

        Toast.makeText(getApplicationContext(),"Forma de entrega alterado!", Toast.LENGTH_LONG).show();
        Intent irTelaInicial = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(irTelaInicial);
        irTelaInicial.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Limpa a pilha de activity
        TipoEntregaActivity.this.finish();

    }

}
