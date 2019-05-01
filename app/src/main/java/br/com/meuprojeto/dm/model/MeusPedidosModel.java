package br.com.meuprojeto.dm.model;

public class MeusPedidosModel {

    private String pedido;
    private String valor;
    private String data;
    private String tipoPagamento;
    private String tipoEntrega;

    public MeusPedidosModel() {
    }

    public MeusPedidosModel(String pedido, String valor, String data, String tipoPagamento, String tipoEntrega) {
        this.pedido = pedido;
        this.valor = valor;
        this.data = data;
        this.tipoPagamento = tipoPagamento;
        this.tipoEntrega = tipoEntrega;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

}
