package model;

import enums.Statuspagamento;
import enums.Tipopagamento;

public class Pagamento {
    private Tipopagamento tipoPagamento;
    private Statuspagamento statusPagamento;
    private float valor;
    private String dataPagamento;

    public Pagamento(Tipopagamento tipoPagamento, Statuspagamento statusPagamento, float valor, String dataPagamento) {
        if (tipoPagamento == null) throw new IllegalArgumentException("Tipo de pagamento inválido.");
        if (statusPagamento == null) throw new IllegalArgumentException("Status de pagamento inválido.");
        if (valor < 0) throw new IllegalArgumentException("Valor não pode ser negativo.");
        if (dataPagamento == null || dataPagamento.isEmpty()) throw new IllegalArgumentException("Data de pagamento inválida.");

        this.tipoPagamento = tipoPagamento;
        this.statusPagamento = statusPagamento;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
    }

    // Getter e Setter para tipoPagamento
    public Tipopagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(Tipopagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    // Getter e Setter para statusPagamento
    public Statuspagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(Statuspagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    // Getter e Setter para valor
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    // Getter e Setter para dataPagamento
    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public boolean pagamentoConcluido() {
        return statusPagamento == Statuspagamento.PAGO;
    }

    public String formatarDataPagamento() {
        return dataPagamento;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "tipoPagamento=" + tipoPagamento +
                ", statusPagamento=" + statusPagamento +
                ", valor=" + valor +
                ", dataPagamento='" + dataPagamento + '\'' +
                '}';
    }
}
