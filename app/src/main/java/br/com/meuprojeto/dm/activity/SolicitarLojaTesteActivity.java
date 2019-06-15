package br.com.meuprojeto.dm.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.meuprojeto.dm.R;

public class SolicitarLojaTesteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitar_loja_teste);
    }

    // AlertDialog
    public void abrirAlerta (View view){

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

            }
        });

        // Criar e exibir o AlertDialog
        dialog.create();
        dialog.show();

    }

}
