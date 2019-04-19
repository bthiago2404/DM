package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.meuprojeto.dm.R;

public class MeuCarrinhoActivity extends AppCompatActivity {

    /* Trecho do codigo referente a logica dos botões de somar e subtrair.
    Vou deixar como comentario pois essa tela vai ser por meio de Web Services.

    private Button acrescentar;
    private Button subtrair;
    private TextView quantidade;
    private int i;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meu_carrinho);

        /* Trecho do codigo referente a logica dos botões de somar e subtrair.
         esse trecho é responsavel por apontar os valores das 3 variaveis citadas acima
         para cada View da tela MeuCarrinho.

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

    /* Trecho do codigo referente a logica dos botões de somar e subtrair.
    Vou deixar como comentario pois essa tela vai ser por meio de Web Services.

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
