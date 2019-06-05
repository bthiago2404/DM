package br.com.meuprojeto.dm.model;

public class VerMaisModel {

    private String ibItem;
    private String tvNomeProduto;
    private String tvValorProduto;
    private String tvValor;

    public VerMaisModel() {

    }

    public VerMaisModel(String tvNomeProduto, String tvValorProduto, String tvValor) {
        this.tvNomeProduto = tvNomeProduto;
        this.tvValorProduto = tvValorProduto;
        this.tvValor = tvValor;

    }

    public String getIbItem() {
        return ibItem;
    }

    public void setIbItem(String ibItem1) {
        this.ibItem = ibItem1;
    }

    public String getTvNomeProduto() {
        return tvNomeProduto;
    }

    public void setTvNomeProduto(String tvNomeProduto1) {
        this.tvNomeProduto = tvNomeProduto1;
    }

    public String getTvValorProduto() {
        return tvValorProduto;
    }

    public void setTvValorProduto(String tvValorProduto1) {
        this.tvValorProduto = tvValorProduto1;
    }

    public String getTvValor() {
        return tvValor;
    }

    public void setTvValor(String tvValor1) {
        this.tvValor = tvValor1;
    }

}
