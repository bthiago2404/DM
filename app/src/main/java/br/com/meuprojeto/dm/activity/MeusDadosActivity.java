package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import br.com.meuprojeto.dm.R;

public class MeusDadosActivity extends AppCompatActivity {

    // Declaração das variaveis que vao ser usadas.
    private EditText etNome, etNumero, etEmail, etRua, etBairro, etNum, etSenha, etNovaSenha, etConfirmeNovaSenha;
    private CheckBox cbManha, cbTarde, cbNoite;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_dados);

        // Apontando as variaveis para seus respctivos Views da tela Novo Usuario.
        etNome = findViewById(R.id.etNome);
        etNumero = findViewById(R.id.etNumero);
        etEmail = findViewById(R.id.etEmail);
        etRua = findViewById(R.id.etRua);
        etBairro = findViewById(R.id.etBairro);
        etNum = findViewById(R.id.etNum);
        etSenha = findViewById(R.id.etSenha);
        etNovaSenha = findViewById(R.id.etNovaSenha);
        etConfirmeNovaSenha = findViewById(R.id.etConfirmeSenha);
        cbManha = findViewById(R.id.cbManha);
        cbTarde = findViewById(R.id.cbTarde);
        cbNoite = findViewById(R.id.cbNoite);
        btnSalvar = findViewById(R.id.btnSalvar);

    }

    // Metodo responsavel por chegar as opções de melhor horario para entrega e inserir no banco.
    public void verificaCheck(){

        if(cbManha.isChecked()){
            // Trecho do codigo onde será inserido a opção de entrega pela manha no banco de dados.
            // Obs: Aqui não devera conter um INSERT no banco e sim um UPDATE!
        }
        if(cbTarde.isChecked()){
            // Trecho do codigo onde será inserido a opção de entrega pela tarde no banco de dados.
            // Obs: Aqui não devera conter um INSERT no banco e sim um UPDATE!
        }
        if(cbNoite.isChecked()){
            // Trecho do codigo onde será inserido a opção de entrega pela noite no banco de dados.
            // Obs: Aqui não devera conter um INSERT no banco e sim um UPDATE!
        }

    }

    // Metodo responsabel por salvar os dados do cliente no banco. (Em Construção).
    public void salvar(View view){

        verificaCheck();
        Toast.makeText(getApplicationContext(),"Dados alterados com sucesso!", Toast.LENGTH_LONG).show();
        Intent irTelaInicial = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(irTelaInicial);
        MeusDadosActivity.this.finish();

    }

}
