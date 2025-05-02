package model;

import enums.Statuspagamento;

public class Pedido {
    private int numeroPedido;
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private float total;
    private String dataPedido;
    private Statuspagamento statusPagamento;

    public Pedido(int numeroPedido, Cliente cliente, Produto produto, int quantidade, float total, String dataPedido, Statuspagamento statusPagamento) {
        if (numeroPedido <= 0) throw new IllegalArgumentException("Número do pedido inválido.");
        if (cliente == null) throw new IllegalArgumentException("Cliente inválido.");
        if (produto == null) throw new IllegalArgumentException("Produto inválido.");
        if (quantidade <= 0) throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        if (total < 0) throw new IllegalArgumentException("Total não pode ser negativo.");
        if (dataPedido == null || dataPedido.isBlank()) throw new IllegalArgumentException("Data do pedido inválida.");
        if (statusPagamento == null) throw new IllegalArgumentException("Status de pagamento inválido.");

        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.total = total;
        this.dataPedido = dataPedido;
        this.statusPagamento = statusPagamento;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Statuspagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(Statuspagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public boolean pagamentoConcluido() {
        return statusPagamento == Statuspagamento.PAGO;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", cliente=" + cliente +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                ", total=" + total +
                ", dataPedido='" + dataPedido + '\'' +
                ", statusPagamento=" + statusPagamento +
                '}';
    }
}
