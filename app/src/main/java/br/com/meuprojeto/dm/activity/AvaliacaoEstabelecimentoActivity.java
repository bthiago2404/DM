package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import br.com.meuprojeto.dm.R;

public class AvaliacaoEstabelecimentoActivity extends AppCompatActivity {

    // Criei as variaveis com os tipos que foram usados na interface.
    private SeekBar seekBar;
    private TextView tvNota;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao_estabelecimento);

        // Apontei no onCreate que as variaveis vão receber os dados dos itens abaixos que existem
        // na interface.
        //OBS: Foi feito no onCreate para toda vez que a tela for chamado essas variaveis possam
        // ser apontadas para os Views corretos.
        seekBar = findViewById(R.id.seekBar);
        tvNota = findViewById(R.id.tvNota);

        // Função responsavel pelo logica do SeekBar.
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            // Esse primeiro metodo é responsabel por retornar a posição do Seekbar e o total
            // de possições disponiveis.
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvNota.setText("Nota " + seekBar.getProgress() + " / " + seekBar.getMax());
            }

            // Esse segunda metodo é responsavel por informar uma mensagem (por exemplo)
            // toda vez que o botão do SeekBar for selecionado.
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            // Esse terceiro metodo é resposavel por informar ma mensagem (por exemplo)
            // toda vez que o botão do SeekBar for solto.
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "Nota do estabelecimento Alterada", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void irTelaInicial(View view) {
        Intent irTelaInicial = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(irTelaInicial);
        AvaliacaoEstabelecimentoActivity.this.finish();
    }

}
