package br.com.meuprojeto.dm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class DepartamentosActivity extends AppCompatActivity {

    private RecyclerView rvDepartamentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departamentos);

        rvDepartamentos = findViewById(R.id.rvDepartamentos);

        // Configurando o adapter



        // Configurando o RyceclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvDepartamentos.setLayoutManager(layoutManager);
        rvDepartamentos.setHasFixedSize(true);
        //rvDepartamentos.setAdapter(  );

    }



}
