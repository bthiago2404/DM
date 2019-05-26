package br.com.meuprojeto.dm.model;

public class VerMaisModel {

    private String ibItem1;
    private String tvNomeProduto1;
    private String tvValorProduto1;
    private String tvValor1;

    private String ibItem2;
    private String tvNomeProduto2;
    private String tvValorProduto2;
    private String tvValor2;

    public VerMaisModel() {

    }

    public VerMaisModel(String tvNomeProduto1, String tvValorProduto1, String tvValor1, String tvNomeProduto2, String tvValorProduto2, String tvValor2) {
        this.tvNomeProduto1 = tvNomeProduto1;
        this.tvValorProduto1 = tvValorProduto1;
        this.tvValor1 = tvValor1;
        this.tvNomeProduto2 = tvNomeProduto2;
        this.tvValorProduto2 = tvValorProduto2;
        this.tvValor2 = tvValor2;
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

    public String getIbItem2() {
        return ibItem2;
    }

    public void setIbItem2(String ibItem2) {
        this.ibItem2 = ibItem2;
    }

    public String getTvNomeProduto2() {
        return tvNomeProduto2;
    }

    public void setTvNomeProduto2(String tvNomeProduto2) {
        this.tvNomeProduto2 = tvNomeProduto2;
    }

    public String getTvValorProduto2() {
        return tvValorProduto2;
    }

    public void setTvValorProduto2(String tvValorProduto2) {
        this.tvValorProduto2 = tvValorProduto2;
    }

    public String getTvValor2() {
        return tvValor2;
    }

    public void setTvValor2(String tvValor2) {
        this.tvValor2 = tvValor2;
    }

}
