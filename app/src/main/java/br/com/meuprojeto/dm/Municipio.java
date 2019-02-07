package br.com.meuprojeto.dm;

public class Municipio {

    // Atributos
    private String getCodMunicipio;
    protected String municipio;
    private String codUf;
    private String uf;
    private boolean excluido;

    // Metodos normais

    //Getters e Setters
    public String getGetCodMunicipio() {
        return getCodMunicipio;
    }

    public void setGetCodMunicipio(String getCodMunicipio) {
        this.getCodMunicipio = getCodMunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCodUf() {
        return codUf;
    }

    public void setCodUf(String codUf) {
        this.codUf = codUf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public boolean isExcluido() {
        return excluido;
    }

    public void setExcluido(boolean excluido) {
        this.excluido = excluido;
    }
}
