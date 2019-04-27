package br.com.meuprojeto.dm.model;

public class DepartamentosModel {

    private String btndepartamentos;
    private String tvdepartamentos;

    public DepartamentosModel(String btndepartamentos, String tvdepartamentos) {
        this.btndepartamentos = btndepartamentos;
        this.tvdepartamentos = tvdepartamentos;
    }

    public String getBtndepartamentos() {
        return btndepartamentos;
    }

    public void setBtndepartamentos(String btndepartamentos) {
        this.btndepartamentos = btndepartamentos;
    }

    public String getTvdepartamentos() {
        return tvdepartamentos;
    }

    public void setTvdepartamentos(String tvdepartamentos) {
        this.tvdepartamentos = tvdepartamentos;
    }

}
