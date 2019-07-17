package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import br.com.meuprojeto.dm.R;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NovoUsuarioActivity extends AppCompatActivity {

    // Declaração das variaveis que vao ser usadas.
    private EditText etNome, etNumero, etCpf, etEmail, etRua, etBairro, etNum, etCid, etSenha, etConfirmeSenha;
    private CheckBox cbManha, cbTarde, cbNoite;

    //URL base do endpoint. Deve sempre terminar com /
    final  String url_Register = "https://deliverymercado.000webhostapp.com/registro.php";
    //final  String url_Register = "http://192.168.1.107/Projeto%20DM/DM-WebService/registro.php";//essa url aqui era a quq eu tava usando no servidor local

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_usuario);

        // Apontando as variaveis para seus respctivos Views da tela Novo Usuario.
        etNome = findViewById(R.id.etNome);
        etNumero = findViewById(R.id.etNumero);
        etCpf = findViewById(R.id.etCpf);
        etEmail = findViewById(R.id.etEmail);
        etRua = findViewById(R.id.etRua);
        etBairro = findViewById(R.id.etBairro);
        etNum = findViewById(R.id.etNum);
        etCid = findViewById(R.id.etCid);
        etSenha = findViewById(R.id.etSenha);
        etConfirmeSenha = findViewById(R.id.etConfirmeSenha);
        cbManha = findViewById(R.id.cbManha);
        cbTarde = findViewById(R.id.cbTarde);
        cbNoite = findViewById(R.id.cbNoite);

    }

    public class RegisterUser extends  AsyncTask<String, Void, String>{
        @Override
        protected String doInBackground(String... strings) {

            String nome = strings[0];
            String cpf = strings[1];
            String rua = strings[2];
            String bairro = strings[3];
            String numero = strings[4];
            String cidade = strings[5];
            String telefone01 = strings[6];
            String email = strings[7];
            String senha = strings[8];

            String finalURL = url_Register + "?IDUSUARIO=&NOME="+ nome +"&CPF="+ cpf +"&RUA="+ rua +"&BAIRRO="+ bairro +"&NUMERO="+ numero +"&CIDADE="+ cidade +"&TELEFONE01="+ telefone01 +"&EMAIL="+ email +"&SENHA="+ senha +"&ATIVO=";

            try {//Para conseguirmos usá-la, (a biblioteca OkHttp) teremos que criar um objeto do tipo OkHttpClient, que será responsável pela comunicação.
                OkHttpClient okHttpClient = new OkHttpClient();

                Request request = new Request.Builder()
                        .url(finalURL)
                        .get()
                        .build();
                Response response = null;

                try {
                    response = okHttpClient.newCall(request).execute();
                    if (response.isSuccessful()) {

                        String result = response.body().string();

                        showToast("registrado com sucesso");
                        Intent i = new Intent(NovoUsuarioActivity.this, MainActivity.class);
                        startActivity(i);
                        finish();

                        } else if (result.equalsIgnoreCase("Usuário já existe")) {
                            showToast("\n" +
                                    "Usuário já existe");
                        } else {
                            showToast("oop! Por favor, tente novamente");
                        }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }catch (Exception e){
                e.printStackTrace();
            }

            return null;

        }
    }

    public void showToast(final String Text){
        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(NovoUsuarioActivity.this,
                        Text, Toast.LENGTH_LONG).show();
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
    public void salvar(View view) {

        if (etNome.getText().toString().length() == 0) {
            etNome.setError(getString(R.string.txt_erro_nome));
        } else if (etCpf.getText().toString().length() == 0) {
            etCpf.setError(getString(R.string.txt_erro_cpf));
        } else if (etNumero.getText().toString().length() == 0) {
            etNumero.setError(getString(R.string.txt_erro_telefone));
        } else if (etEmail.getText().toString().length() == 0) {
            etEmail.setError(getString(R.string.txt_erro_email2));
        } else if (etRua.getText().toString().length() == 0) {
            etRua.setError(getString(R.string.txt_erro_rua));
        } else if (etBairro.getText().toString().length() == 0) {
            etBairro.setError(getString(R.string.txt_erro_bairro));
        } else if (etNum.getText().toString().length() == 0) {
            etNum.setError(getString(R.string.txt_erro_numero));
        } else if (etCid.getText().toString().length() == 0) {
            etCid.setError(getString(R.string.txt_erro_cidade));
        } else if (etSenha.getText().toString().length() == 0) {
            etSenha.setError(getString(R.string.txt_erro_senha_atual));
        } else if(etConfirmeSenha.getText().toString().length() == 0) {
            etConfirmeSenha.setError(getString(R.string.txt_erro_senha));
        } else {

            String nome = etNome.getText().toString();
            String cpf = etCpf.getText().toString();
            String rua = etRua.getText().toString();
            String bairro = etBairro.getText().toString();
            String numero = etNum.getText().toString();
            String cidade = etCid.getText().toString();
            String telefone01 = etNumero.getText().toString();
            String email = etEmail.getText().toString();
            String senha = etSenha.getText().toString();

            new RegisterUser().execute(nome,cpf,rua,bairro,numero,cidade,telefone01,email,senha);

            verificaCheck();
            Toast.makeText(getApplicationContext(), "Cadastro realizado com sucesso!", Toast.LENGTH_LONG).show();
            Intent irTelaInicial = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(irTelaInicial);
            irTelaInicial.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Limpa a pinha de Activity's
            NovoUsuarioActivity.this.finish(); // Finaliza a activity atual e não permite voltar para ela.

        }
    }
}
