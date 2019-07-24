package br.com.meuprojeto.dm.activity;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import br.com.meuprojeto.dm.R;

public class NovoUsuarioActivity extends AppCompatActivity {

    // Declaração das variaveis que vao ser usadas.
    private EditText etNome, etTelefone, etCpf, etEmail, etRua, etBairro, etNumero, etCid, etSenha, etConfirmeSenha;
    private CheckBox cbManha, cbTarde, cbNoite;
    private Button btnSalvar;

    /*esse pe=rimeiro e para usarno servidor local
    private String HOST = "http://192.168.1.107/Projeto%20DM/Login";*/

    //esse segundo e para usar no servidor remoto
    private String HOST = "https://deliverymercado.000webhostapp.com/Login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_usuario);

        // Apontando as variaveis para seus respctivos Views da tela Novo Usuario.
        etNome = findViewById(R.id.etNome);
        etTelefone = findViewById(R.id.etTelefone);
        etCpf = findViewById(R.id.etCpf);
        etEmail = findViewById(R.id.etEmail);
        etRua = findViewById(R.id.etRua);
        etBairro = findViewById(R.id.etBairro);
        etNumero = findViewById(R.id.etNumero);
        etCid = findViewById(R.id.etCid);
        etSenha = findViewById(R.id.etSenha);
        etConfirmeSenha = findViewById(R.id.etConfirmeSenha);

        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = etNome.getText().toString();
                String cpf = etCpf.getText().toString();
                String telefone01 = etTelefone.getText().toString();
                String email = etEmail.getText().toString();
                String rua = etRua.getText().toString();
                String bairro = etBairro.getText().toString();
                String numero = etNumero.getText().toString();
                String cidade = etCid.getText().toString();
                String senha = etSenha.getText().toString();
                String confirme = etConfirmeSenha.getText().toString();

                String URL = HOST + "/cadastrar.php";

                if(confirme.equals(senha)){

                    if(nome.isEmpty() || cpf.isEmpty() || telefone01.isEmpty() || email.isEmpty() || rua.isEmpty() || bairro.isEmpty() || numero.isEmpty() || cidade.isEmpty()){
                        Toast.makeText(NovoUsuarioActivity.this,"Todos os campos são obrigatorios!" , Toast.LENGTH_LONG ).show();
                    }else {
                        Ion.with(NovoUsuarioActivity.this)
                                .load(URL)
                                .setBodyParameter("nome_app",nome)
                                .setBodyParameter("cpf_app",cpf)
                                .setBodyParameter("rua_app",rua)
                                .setBodyParameter("bairro_app",bairro)
                                .setBodyParameter("numero_app",numero)
                                .setBodyParameter("cidade_app",cidade)
                                .setBodyParameter("telefone01_app",telefone01)
                                .setBodyParameter("email_app",email)
                                .setBodyParameter("senha_app",senha)
                                .asJsonObject()
                                .setCallback(new FutureCallback<JsonObject>() {
                                    @Override
                                    public void onCompleted(Exception e, JsonObject result) {

                                        try {
                                            //Toast.makeText(NovoUsuarioActivity.this, "Nome:" + result.get("NOME").getAsString(), Toast.LENGTH_LONG).show();
                                            String RETORNO = result.get("CADASTRO").getAsString();

                                            if(RETORNO.equals("EMAIL_ERRO")){
                                                Toast.makeText(NovoUsuarioActivity.this, "Ops! esse e-mail ja esta cadastrado." , Toast.LENGTH_LONG).show();
                                            }else if(RETORNO.equals("SUCESSO")){
                                                Toast.makeText(NovoUsuarioActivity.this, "Cadastrado com sucesso!" , Toast.LENGTH_LONG).show();

                                            }else{
                                                Toast.makeText(NovoUsuarioActivity.this, "Ops! Ocorreu um erro.", Toast.LENGTH_LONG).show();
                                            }

                                        } catch (Exception erro) {
                                            Toast.makeText(NovoUsuarioActivity.this, "Ops! Ocorreu um erro." + erro, Toast.LENGTH_LONG).show();
                                        }
                                    }
                                });
                    }

                }else{
                    Toast.makeText(NovoUsuarioActivity.this,"As senhas não conferem." , Toast.LENGTH_LONG ).show();
                }

            }
        });
    }

    // Metodo responsavel por chegar as opções de melhor horario para entrega e inserir no banco.
    public void verificaCheck() {

        if (cbManha.isChecked()) {
            // Trecho do codigo onde será inserido a opção de entrega pela manha no banco de dados.
            // Obs: Aqui não devera conter um INSERT no banco e sim um UPDATE!
        }
        if (cbTarde.isChecked()) {
            // Trecho do codigo onde será inserido a opção de entrega pela tarde no banco de dados.
            // Obs: Aqui não devera conter um INSERT no banco e sim um UPDATE!
        }
        if (cbNoite.isChecked()) {
            // Trecho do codigo onde será inserido a opção de entrega pela noite no banco de dados.
            // Obs: Aqui não devera conter um INSERT no banco e sim um UPDATE!
        }

    }

    // Metodo responsabel por salvar os dados do cliente no banco. (Em Construção).
   /* public void salvar(View view) {

        if (etNome.getText().toString().length() == 0) {
            etNome.setError(getString(R.string.txt_erro_nome));
        } else if (etCpf.getText().toString().length() == 0) {
            etCpf.setError(getString(R.string.txt_erro_cpf));
        } else if (etTelefone.getText().toString().length() == 0) {
            etTelefone.setError(getString(R.string.txt_erro_telefone));
        } else if (etEmail.getText().toString().length() == 0) {
            etEmail.setError(getString(R.string.txt_erro_email2));
        } else if (etRua.getText().toString().length() == 0) {
            etRua.setError(getString(R.string.txt_erro_rua));
        } else if (etBairro.getText().toString().length() == 0) {
            etBairro.setError(getString(R.string.txt_erro_bairro));
        } else if (etNumero.getText().toString().length() == 0) {
            etNumero.setError(getString(R.string.txt_erro_numero));
        } else if (etCid.getText().toString().length() == 0) {
            etCid.setError(getString(R.string.txt_erro_cidade));
        } else if (etSenha.getText().toString().length() == 0) {
            etSenha.setError(getString(R.string.txt_erro_senha_atual));
        } else if(etConfirmeSenha.getText().toString().length() == 0) {
            etConfirmeSenha.setError(getString(R.string.txt_erro_senha));
        } else {

            verificaCheck();
            Intent irTelaInicial = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(irTelaInicial);
            irTelaInicial.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Limpa a pinha de Activity's
            NovoUsuarioActivity.this.finish(); // Finaliza a activity atual e não permite voltar para ela.

        }
    }*/
}
