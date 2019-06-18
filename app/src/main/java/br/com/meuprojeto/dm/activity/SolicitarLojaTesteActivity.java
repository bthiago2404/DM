package br.com.meuprojeto.dm.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import br.com.meuprojeto.dm.R;

public class SolicitarLojaTesteActivity extends AppCompatActivity {

    private EditText etNome, etCelular, etNumero, etRua, etBairro, etNum, etCnpj;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitar_loja_teste);

        etNome = findViewById(R.id.etNome);
        etCelular = findViewById(R.id.etCelular);
        etNumero = findViewById(R.id.etNumero);
        etRua = findViewById(R.id.etRua);
        etBairro = findViewById(R.id.etBairro);
        etNum = findViewById(R.id.etNum);
        etCnpj = findViewById(R.id.etCnpj);
        btnSalvar = findViewById(R.id.btnSalvar);

    }

    // AlertDialog
    public void abrirAlerta (View view){

        if(etNome.getText().toString().length() == 0){
            etNome.setError(getString(R.string.txt_erro_nome));
        } else if(etCelular.getText().toString().length() == 0){
            etCelular.setError(getString(R.string.txt_erro_celular));
        } else if(etNumero.getText().toString().length() == 0){
            etNumero.setError(getString(R.string.txt_erro_numero));
        } else if(etRua.getText().toString().length() == 0){
            etRua.setError(getString(R.string.txt_erro_rua));
        } else if(etBairro.getText().toString().length() == 0){
            etBairro.setError(getString(R.string.txt_erro_bairro));
        } else if(etNum.getText().toString().length() == 0){
            etNum.setError(getString(R.string.txt_erro_numero));
        } else if(etCnpj.getText().toString().length() == 0){
            etCnpj.setError(getString(R.string.txt_erro_cnpj));
        } else {

            AlertDialog.Builder dialog = new AlertDialog.Builder(this);

            // Configurando Título e Mensagem do AlertDialoh.
            dialog.setTitle("Obrigado!");
            dialog.setMessage("Agradecemos o seu interesse em ser nosso parceiro. Em breve entraremos em contato e agendaremos uma visita para nos conhecermos melhor ;)");

            // Configurar Cancelamento
            dialog.setCancelable(false);

            // Configurar Icone
            dialog.setIcon(android.R.drawable.ic_menu_info_details
            );

            // Configurar ações para os botões.
            dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Intent irTelaInicial = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(irTelaInicial);
                    irTelaInicial.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Limpa a pilha de activity
                    SolicitarLojaTesteActivity.this.finish();

                }
            });

            // Criar e exibir o AlertDialog
            dialog.create();
            dialog.show();

        }

    }

}
