package br.com.meuprojeto.dm.model;

public class ModelMapaLojas {

    private String loja;
    private String cidade;
    private String bairro;

    public ModelMapaLojas(){

    }

    public ModelMapaLojas(String loja, String cidade, String bairro) {
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
