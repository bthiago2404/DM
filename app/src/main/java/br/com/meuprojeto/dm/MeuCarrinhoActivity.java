package br.com.meuprojeto.dm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MeuCarrinhoActivity extends AppCompatActivity {

    private Button acrescentar;
    private Button subtrair;
    private TextView quantidade;
    private int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meu_carrinho);

        /*
        acrescentar = findViewById(R.id.btnAcrescentar);
        subtrair = findViewById(R.id.btnSubtrair);
        quantidade = findViewById(R.id.txtResultado);
        */

    }

    // Interação entre a tela MEU CARRINHO e a tela CONFIRMAÇÃO DE PEDIDO
    // através do botão FINALIZAR PEDIDO.
    public void meuCarrinho(View view) {
        Intent irTelaConfirmacaoPedido = new Intent(getApplicationContext(), ConfirmacaoPedidoActivity.class);
        startActivity(irTelaConfirmacaoPedido);
    }

    // Esse trecho de codigo é referente a logica de acrescentar produtos
    // na tela meu carrinho.  VOU DEIXAR INATIVO POIS ESSA TELA VAI SER POR MEIO DE WEBSERVICES.
    /*
    public void acrescentarItens(View view) {
        i = i + 1;
        String numero2 = String.valueOf(i);
        quantidade.setText(numero2);
    }

    public void subtrairItens(View view) {
        i = i - 1;
        String numero2 = String.valueOf(i);
        quantidade.setText(numero2);
    }
    */

}
