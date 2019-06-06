package br.com.meuprojeto.dm.model;

public class LojaSelecionadaModel {

    private String ibItem;
    private String tvNomeProduto;
    private String tvValorProduto;
    private String tvValor;

    public LojaSelecionadaModel() {

    }

    public LojaSelecionadaModel(String tvNomeProduto, String tvValorProduto, String tvValor) {
        this.tvNomeProduto = tvNomeProduto;
        this.tvValorProduto = tvValorProduto;
        this.tvValor = tvValor;
    }

    public String getTvNomeProduto() {
        return tvNomeProduto;
    }

    public void setTvNomeProduto(String tvNomeProduto) {
        this.tvNomeProduto = tvNomeProduto;
    }

    public String getTvValorProduto() {
        return tvValorProduto;
    }

    public void setTvValorProduto(String tvValorProduto) {
        this.tvValorProduto = tvValorProduto;
    }

    public String getTvValor() {
        return tvValor;
    }

    public void setTvValor(String tvValor) {
        this.tvValor = tvValor;
    }

}
