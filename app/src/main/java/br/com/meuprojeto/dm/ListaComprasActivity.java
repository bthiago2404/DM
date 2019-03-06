package br.com.meuprojeto.dm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListaComprasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_compras);
    }

    public void meuCarrinho(View view) {
        Intent irTelaMeuCarrinho = new Intent(getApplicationContext(), MeuCarrinhoActivity.class);
        startActivity(irTelaMeuCarrinho);
    }

}
