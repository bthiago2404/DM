package br.com.meuprojeto.dm.model;

public class VerMaisModel {

    private String ibItem1;
    private String tvNomeProduto1;
    private String tvValorProduto1;
    private String tvValor1;


    public VerMaisModel() {

    }

    public VerMaisModel(String tvNomeProduto1, String tvValorProduto1, String tvValor1) {
        this.tvNomeProduto1 = tvNomeProduto1;
        this.tvValorProduto1 = tvValorProduto1;
        this.tvValor1 = tvValor1;

    }

    public String getIbItem1() {
        return ibItem1;
    }

    public void setIbItem1(String ibItem1) {
        this.ibItem1 = ibItem1;
    }

    public String getTvNomeProduto1() {
        return tvNomeProduto1;
    }

    public void setTvNomeProduto1(String tvNomeProduto1) {
        this.tvNomeProduto1 = tvNomeProduto1;
    }

    public String getTvValorProduto1() {
        return tvValorProduto1;
    }

    public void setTvValorProduto1(String tvValorProduto1) {
        this.tvValorProduto1 = tvValorProduto1;
    }

    public String getTvValor1() {
        return tvValor1;
    }

    public void setTvValor1(String tvValor1) {
        this.tvValor1 = tvValor1;
    }

}
