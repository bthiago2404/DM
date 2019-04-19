package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

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

        if (tipoLogin.isChecked()) {

            // Se o Switch estiver ativo o aplicativo tera que direcionar o usuario para
            // a tela de cadastro.

            // Metodo responsavel por exibir uma mensagem flutuante informativa como fedback ao usuario.
            Toast.makeText(getApplicationContext(),"Você será direcionado para tela de cadastro", Toast.LENGTH_LONG).show();

            // Metodo responsavel por fazer a interação entre a tela de login e a tela de cadastro.
            Intent irTelaNovoUsuario = new Intent(getApplicationContext(), NovoUsuarioActivity.class);
            startActivity(irTelaNovoUsuario);

        } else {

            // Se o Switch estiver inativo o aplicativo tera que fazer uma consulta no banco
            // de dados, se os dados digitados estiverem corretos ira retornar
            // uma mensagem: "Acesso permitido" (por meio de um TOAST)
            // caso os dados estejam errados retornar uma mensagem: "Acesso negado"
            // (por meio de um ALERTDIALOG).
            Toast.makeText(getApplicationContext(),"Consultando dados", Toast.LENGTH_LONG).show();

        }

    }

}
