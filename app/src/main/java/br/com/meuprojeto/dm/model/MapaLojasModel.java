package br.com.meuprojeto.dm.model;

public class MapaLojasModel {

    private String loja;
    private String cidade;
    private String bairro;
    private String telefone;

    public MapaLojasModel() {
    }

    public MapaLojasModel(String loja, String cidade, String bairro, String telefone) {
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
