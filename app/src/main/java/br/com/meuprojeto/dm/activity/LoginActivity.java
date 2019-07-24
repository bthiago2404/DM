package br.com.meuprojeto.dm.activity;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Switch;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import br.com.meuprojeto.dm.R;

public class LoginActivity extends AppCompatActivity {

    // Declaração das variaveis que vao ser usadas.
    private EditText etLogin;
    private EditText etSenha;
    private Switch tipoLogin;
    private Button btnEntrar;

    /*esse pe=rimeiro e para usarno servidor local
    private String HOST = "http://192.168.1.107/Projeto%20DM/Login";*/

    //esse segundo e para usar no servidor remoto
    private String HOST = "https://deliverymercado.000webhostapp.com/Login";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Apontando as variaveis para seus respctivos Views da tela login.

        etLogin = findViewById(R.id.etLogin);
        etSenha = findViewById(R.id.etSenha);
        tipoLogin = findViewById(R.id.swTipoLogin);
        btnEntrar = findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(tipoLogin.isChecked()){

                    // Se o Switch estiver ativo o aplicativo tera que direcionar o usuario para
                    // a tela de cadastro.
                    // Metodo responsavel por fazer a interação entre a tela de login e a tela de cadastro.
                    Intent irTelaNovoUsuario = new Intent(getApplicationContext(), NovoUsuarioActivity.class);
                    startActivity(irTelaNovoUsuario);
                    irTelaNovoUsuario.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Finaliza a pilha de activity
                    LoginActivity.this.finish(); // Finaliza a activity atual

                }else{

                    String email = etLogin.getText().toString();
                    String senha = etSenha.getText().toString();

                    String URL = HOST + "/logar.php";

                    if( email.isEmpty() || senha.isEmpty()){
                        Toast.makeText(LoginActivity.this,"Todos os campos são obrigatorios" , Toast.LENGTH_LONG ).show();
                    }else {
                        Ion.with(LoginActivity.this)
                                .load(URL)
                                .setBodyParameter("email_app",email)
                                .setBodyParameter("senha_app",senha)
                                .asJsonObject()
                                .setCallback(new FutureCallback<JsonObject>() {
                                    @Override
                                    public void onCompleted(Exception e, JsonObject result) {

                                        try {
                                            //Toast.makeText(NovoUsuarioActivity.this, "Nome:" + result.get("NOME").getAsString(), Toast.LENGTH_LONG).show();
                                            String RETORNO = result.get("LOGIN").getAsString();

                                            if(RETORNO.equals("ERRO")){
                                                Toast.makeText(LoginActivity.this, "Ops! e-mail ou senha incorretos" , Toast.LENGTH_LONG).show();
                                            }else if(RETORNO.equals("SUCESSO")){

                                                Intent abrePrincipal = new Intent(LoginActivity.this, MainActivity.class);
                                                startActivity(abrePrincipal);

                                            }else{
                                                Toast.makeText(LoginActivity.this, "Ops! Ocorreu um erro", Toast.LENGTH_LONG).show();
                                            }

                                        } catch (Exception erro) {
                                            Toast.makeText(LoginActivity.this, "Ops! Ocorreu um erro," + erro, Toast.LENGTH_LONG).show();
                                        }

                                    }
                                });
                    }

                }

            }
        });


    }

    @Override
    protected void onPause() {
        super.onPause();

        finish();
    }

}
