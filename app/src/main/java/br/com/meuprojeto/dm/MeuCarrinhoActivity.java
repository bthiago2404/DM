package br.com.meuprojeto.dm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MeuCarrinhoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meu_carrinho);
    }

    // Interação entre a tela MEU CARRINHO e a tela CONFIRMAÇÃO DE PEDIDO
    // através do botão FINALIZAR PEDIDO.
    public void meuCarrinho(View view) {
        Intent irTelaConfirmacaoPedido = new Intent(getApplicationContext(), ConfirmacaoPedidoActivity.class);
        startActivity(irTelaConfirmacaoPedido);
    }

}
