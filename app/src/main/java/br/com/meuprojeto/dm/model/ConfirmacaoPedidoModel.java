package br.com.meuprojeto.dm.model;

public class ConfirmacaoPedidoModel {

    private String quantidadeItem;
    private String nomeItem;
    private String valorItem;
    private String quantidadeTotalItem;
    private String valorTotal;

    public ConfirmacaoPedidoModel() {

    }

    public ConfirmacaoPedidoModel(String quantidadeItem, String nomeItem, String valorItem) {
        this.quantidadeItem = quantidadeItem;
        this.nomeItem = nomeItem;
        this.valorItem = valorItem;
    }

    public String getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(String quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getValorItem() {
        return valorItem;
    }

    public void setValorItem(String valorItem) {
        this.valorItem = valorItem;
    }

    public String getQuantidadeTotalItem() {
        return quantidadeTotalItem;
    }

    public void setQuantidadeTotalItem(String quantidadeTotalItem) {
        this.quantidadeTotalItem = quantidadeTotalItem;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

}
