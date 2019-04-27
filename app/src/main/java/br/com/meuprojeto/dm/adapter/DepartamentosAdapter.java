package br.com.meuprojeto.dm.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.List;
import br.com.meuprojeto.dm.R;
import br.com.meuprojeto.dm.model.DepartamentosModel;

public class DepartamentosAdapter extends RecyclerView.Adapter<DepartamentosAdapter.MyViewHolder> {

    // Criei um atributo para ser usado no decorrer do codigo abaixo.
    private List<DepartamentosModel> departamentosAdapter;

    // Metodo construtor da classe DepartamentosAdapter.
    public DepartamentosAdapter(List<DepartamentosModel> lista) {
        this.departamentosAdapter = lista;
    }

    // Metodo abaixo apenas cria a visualização dos itens. Pelo que eu entendi ate o momento,
    // o metodo abaixo traz o layout em xml e converte para um objeto para poder ser usado
    // como referencia para ser instanciado posteriormente.
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemLista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_departamentos, viewGroup, false);

        return new MyViewHolder(itemLista);
    }

    // O metodo abaixo é responsavel por fazer a exibição dos items no RecycleView.
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        DepartamentosModel listaDepartamentos = departamentosAdapter.get(i);

        myViewHolder.btndepartamento.setText(listaDepartamentos.getBtndepartamentos());
        myViewHolder.tvdepartamento.setText(listaDepartamentos.getTvdepartamentos());

    }

    // Esse metodo é responsavel por retornar a quantidade de itens que vão ser exibidos.
    @Override
    public int getItemCount() {
        return departamentosAdapter.size();
    }

    // Inner class necessario para o funcionamento perfeito do adapter.
    public class MyViewHolder extends RecyclerView.ViewHolder{

        Button btndepartamento;
        TextView tvdepartamento;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            btndepartamento = itemView.findViewById(R.id.btnDepartamento);
            tvdepartamento = itemView.findViewById(R.id.tvDepartamento);

        }
    }

}
