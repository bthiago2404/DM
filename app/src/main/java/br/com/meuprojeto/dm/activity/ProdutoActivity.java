package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import br.com.meuprojeto.dm.R;

public class ProdutoActivity extends AppCompatActivity {

    //Trecho do codigo referente a logica dos botões de somar e subtrair.
    //Vou deixar como comentario pois essa tela vai ser por meio de Web Services.
    private Button btnAcrescentar;
    private Button btnSubtrair;
    private TextView tvQuantidade;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        //Trecho do codigo referente a logica dos botões de somar e subtrair.
        //esse trecho é responsavel por apontar os valores das 3 variaveis citadas acima
        //para cada View da tela MeuCarrinho.
        btnAcrescentar = findViewById(R.id.btnAcrescentar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        tvQuantidade = findViewById(R.id.tvQuantidade);

    }

    //Trecho do codigo referente a logica dos botões de somar e subtrair.
    //Vou deixar como comentario pois essa tela vai ser por meio de Web Services.
    public void acrescentarItens(View view) {
        if(i >= 0){
            i = i + 1;
            String numero2 = String.valueOf(i);
            tvQuantidade.setText(numero2);
        } else {
            i = 0;
        }

    }

    public void subtrairItens(View view) {
        if (i > 0) {
            i = i - 1;
            String numero2 = String.valueOf(i);
            tvQuantidade.setText(numero2);
        } else {
            i = 0;
        }

    }

    public void irTelaLojaSelecionada(View view){
        Intent irTelaLojaSelecionada = new Intent(getApplicationContext(), LojaSelecionadaActivity.class);
        startActivity(irTelaLojaSelecionada);
    }

}
