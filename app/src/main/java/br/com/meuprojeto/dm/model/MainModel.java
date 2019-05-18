package br.com.meuprojeto.dm.model;

public class MainModel {

    private String loja;
    private String tempoEntrega;
    private String valorEntrega;

    public MainModel() {
    }

    public MainModel(String loja, String tempoEntrega, String valorEntrega) {
        this.loja = loja;
        this.tempoEntrega = tempoEntrega;
        this.valorEntrega = valorEntrega;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public String getTempoEntrega() {
        return tempoEntrega;
    }

    public void setTempoEntrega(String tempoEntrega) {
        this.tempoEntrega = tempoEntrega;
    }

    public String getValorEntrega() {
        return valorEntrega;
    }

    public void setValorEntrega(String valorEntrega) {
        this.valorEntrega = valorEntrega;
    }

}
