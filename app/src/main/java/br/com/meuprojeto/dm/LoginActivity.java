package br.com.meuprojeto.dm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

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

        // Apontando as variaveis para seus respctivos Views da tela login
        login = findViewById(R.id.etLogin);
        senha = findViewById(R.id.etSenha);
        tipoLogin = findViewById(R.id.swTipoLogin);
        entrar = findViewById(R.id.btnEntrar);

    }

    // Metodo que será responsável pelo login no app.
    /*
    public void logar(){

        // Se o login estiver correto, mandar o usuário para a tela inicial logado.
        // Se o login estiver errado, informar erro ao usuário.
        if () {

        } else {

        }

    }
    */

}
