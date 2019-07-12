package br.com.meuprojeto.dm.activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import br.com.meuprojeto.dm.R;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class LoginActivity extends AppCompatActivity {

    // Declaração das variaveis que vao ser usadas.
    private EditText etLogin;
    private EditText etSenha;
    private Switch tipoLogin;
    private Button btnEntrar;

    /*private String senha;
    private String email;*/

    //aqui onde vai a url da API
    final  String url_Login = "https://deliverymercado.000webhostapp.com/conexaoLogin.php";
    //final  String url_Login = "http://192.168.1.107/Projeto%20DM/DM-WebService/conexaoLogin.php";//essa url aqui era a quq eu tava usando no servidor local


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

                String Email = etLogin.getText().toString();
                String Password = etSenha.getText().toString();

                new LoginUser().execute(Email, Password);

               if(tipoLogin.isChecked()){

                    // Se o Switch estiver ativo o aplicativo tera que direcionar o usuario para
                    // a tela de cadastro.
                    // Metodo responsavel por fazer a interação entre a tela de login e a tela de cadastro.
                    Intent irTelaNovoUsuario = new Intent(getApplicationContext(), NovoUsuarioActivity.class);
                    startActivity(irTelaNovoUsuario);
                    irTelaNovoUsuario.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Finaliza a pilha de activity
                    LoginActivity.this.finish(); // Finaliza a activity atual

                }else {

                    if(etLogin.getText().toString().length() == 0){
                        etLogin.setError(getString(R.string.txt_erro_email));
                    } else if(etSenha.getText().toString().length() == 0){
                        etSenha.setError(getString(R.string.txt_erro_senha));
                    }

                }
            }
        });

    }

    public  class LoginUser extends AsyncTask<String,Void,String>{

        @Override
        protected String doInBackground(String... strings) {
            String Email = strings[0];
            String Password = strings[1];

            OkHttpClient okHttpClient = new OkHttpClient();
            RequestBody formBody = new FormBody.Builder()
                    .add("EMAIL", Email)
                    .add("SENHA", Password)
                    .build();

            Request request = new Request.Builder()
                    .url(url_Login)
                    .post(formBody)
                    .build();

            Response response = null;
            try{
                response = okHttpClient.newCall(request).execute();
                if(response.isSuccessful()){
                    String result = response.body().string();
                    if(result.equalsIgnoreCase("login")){ Intent i = new Intent(LoginActivity.this,MainActivity.class);
                        startActivity(i);
                        finish();
                    }else{
                        showToast("E-mail ou senha incompatíveis!");
                    }
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
                Toast.makeText(LoginActivity.this,
                        Text, Toast.LENGTH_LONG).show();
            }
        });
    }

}
