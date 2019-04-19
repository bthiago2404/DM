package br.com.meuprojeto.dm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MapaLojasActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_lojas);

        recyclerView = findViewById(R.id.recyclerView);

        // Configurando o Adapter (o adapter serve para receber os dados, sejam eles de uma
        // matriz, vetor ou de uma base de dados, apos feito isso o adapter vai tratar os dados
        // e servir como parametro para ser usado posteriormente no RecyclerView.


        // Configurando o Recycleview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        // O metodo abaixo faz com que o recyclerView tenha um tamanho fixo.
        recyclerView.setHasFixedSize(true);
        //recyclerView.setAdapter();

    }

}
