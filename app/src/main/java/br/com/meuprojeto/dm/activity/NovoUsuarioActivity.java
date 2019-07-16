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
    private Button btnSalvar;
    //URL base do endpoint. Deve sempre terminar com /
    //final  String url_Register = "https://deliverymercado.000webhostapp.com/registro.php";
    final  String url_Register = "http://192.168.1.107/Projeto%20DM/DM-WebService/registro.php";//essa url aqui era a quq eu tava usando no servidor local

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
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String Name = etNome.getText().toString();
                String Cpf = etCpf.getText().toString();
                String Rua = etRua.getText().toString();
                String Bairro = etBairro.getText().toString();
                String Numero = etNum.getText().toString();
                String Cidade = etCid.getText().toString();
                String Telefone01 = etNumero.getText().toString();
                String Email = etEmail.getText().toString();
                String Senha = etSenha.getText().toString();



                new RegisterUser().execute(Name,Cpf,Rua,Bairro,Numero,Cidade,Telefone01,Email,Senha);

            }
        });

    }

    public class RegisterUser extends  AsyncTask<String, Void, String>{
        @Override
        protected String doInBackground(String... strings) {

            String Name = strings[0];
            String Cpf = strings[1];
            String Rua = strings[2];
            String Bairro = strings[3];
            String Numero = strings[4];
            String Cidade = strings[5];
            String Telefone01 = strings[6];
            String Email = strings[7];
            String Senha = strings[8];

            String finalURL = url_Register + "?IDUSUARIO=&NOME="+ Name +"&CPF="+ Cpf +"&RUA="+ Rua +"&BAIRRO="+ Bairro +"&NUMERO="+ Numero +"&CIDADE="+ Cidade +"&TELEFONE01="+ Telefone01 +"&EMAIL="+ Email +"&SENHA="+ Senha +"&ATIVO=";


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

                        if (result.equalsIgnoreCase("\n" +
                                "Usuário registrado com sucesso")) {
                            showToast("registrado com sucesso");
                            Intent i = new Intent(NovoUsuarioActivity.this,
                                    MainActivity.class);
                            startActivity(i);
                            finish();
                        } else if (result.equalsIgnoreCase("Usuário já existe")) {
                            showToast("\n" +
                                    "Usuário já existe");
                        } else {
                            showToast("oop! Por favor, tente novamente");
                        }
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
    public void salvar() {

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
                verificaCheck();
                Toast.makeText(getApplicationContext(), "Cadastro realizado com sucesso!", Toast.LENGTH_LONG).show();
                Intent irTelaInicial = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(irTelaInicial);
                irTelaInicial.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Limpa a pinha de Activity's
                NovoUsuarioActivity.this.finish(); // Finaliza a activity atual e não permite voltar para ela.

        }
    }
}
