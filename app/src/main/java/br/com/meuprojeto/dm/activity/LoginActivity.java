package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import br.com.meuprojeto.dm.R;

public class LoginActivity extends AppCompatActivity {

    // Declaração das variaveis que vao ser usadas.
    private EditText login;
    private EditText senha;
    private Switch tipoLogin;
    private Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Apontando as variaveis para seus respctivos Views da tela login.
        login = findViewById(R.id.etLogin);
        senha = findViewById(R.id.etSenha);
        tipoLogin = findViewById(R.id.swTipoLogin);
        entrar = findViewById(R.id.btnEntrar);

    }

    // Metodo que será responsável pelo login no app.
    public void logar(View view){

        if(tipoLogin.isChecked()){

            // Se o Switch estiver ativo o aplicativo tera que direcionar o usuario para
            // a tela de cadastro.
            // Metodo responsavel por fazer a interação entre a tela de login e a tela de cadastro.
            Intent irTelaNovoUsuario = new Intent(getApplicationContext(), NovoUsuarioActivity.class);
            startActivity(irTelaNovoUsuario);
            irTelaNovoUsuario.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Finaliza a pilha de activity
            LoginActivity.this.finish(); // Finaliza a activity atual

        } else {

            if(login.getText().toString().length() == 0){
                login.setError(getString(R.string.txt_erro_email));
            } else if(senha.getText().toString().length() == 0){
                senha.setError(getString(R.string.txt_erro_senha));
            } else {
                Intent irTelaInicial = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(irTelaInicial);
                irTelaInicial.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Finaliza a pilha de activity
                LoginActivity.this.finish(); // Finaliza a activity atual
            }

        }

    }

}
