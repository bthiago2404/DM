package br.com.meuprojeto.dm.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.meuprojeto.dm.R;

/**
 * A simple {@link Fragment} subclass.
 */

public class TesteFragment extends Fragment {

    // Criei dois objetos que serão usados no decorrer do codigo.
    // Um é referente ao SearchView.
    // E o outro é referente ao RecyclerView.
    private SearchView svBusca;
    private RecyclerView recyclerPesquisa;

    // Metodo construtor da classe (não sei porque mas é necessario)
    public TesteFragment() {
        // Required empty public constructor
    }

    // Metoro onCreateView que é referente a um metodo onCreat de uma Activity.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_teste, container, false);

        // Apontei a variavel recyclerPesquisa para o recyclerview fragment_test.
        recyclerPesquisa = view.findViewById(R.id.recyclerPesquisa);
        svBusca = view.findViewById(R.id.svBusca);


        // Configurar o SearchView
        svBusca.setQueryHint("Digite o Bairro...");
        svBusca.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.d("onQueryTextChange","texto digitado: " + newText);
                return false;
            }
        });

        return view;

    }

}
/*
* Classe referente a motor de busca do aplicativo.
* A classe está inativa pois não consegui fazer funcionar, porém decidir colocar o motor de busca
* no webservice pois dessa forma terei melhor desempenho do aplicativo e o retorno da busca será
* mais completo do que apenas na tela do RecycleView.
*/