package br.com.meuprojeto.dm.model;

public class ModelMapaLojas {

    private String zona;
    private String bairro;

    public ModelMapaLojas(){

    }

    public ModelMapaLojas(String zona, String bairro) {
        this.zona = zona;
        this.bairro = bairro;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

}
