package br.com.meuprojeto.dm.model;

public class MeuCarrinhoModel {

    private String tvItem;
    private String tvValor;

    public MeuCarrinhoModel() {
    }

    public MeuCarrinhoModel(String tvItem, String tvValor) {
        this.tvItem = tvItem;
        this.tvValor = tvValor;
    }

    public String getTvItem() {
        return tvItem;
    }

    public void setTvItem(String tvItem) {
        this.tvItem = tvItem;
    }

    public String getTvValor() {
        return tvValor;
    }

    public void setTvValor(String tvValor) {
        this.tvValor = tvValor;
    }

}
