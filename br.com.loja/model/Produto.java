package model;


public class Produto {
    private String nome;
    private String descricao;
    private String categoria;
    private float tamanho;
    private String cor;
    private float preco;
    private int estoque;
    private String imagem;

    public Produto(String nome, String descricao, String categoria, float tamanho, String cor, float preco, int estoque, String imagem) {
        if (nome == null || nome.isEmpty()) throw new IllegalArgumentException("Nome inválido.");
        if (descricao == null || descricao.isEmpty()) throw new IllegalArgumentException("Descrição inválida.");
        if (categoria == null || categoria.isEmpty()) throw new IllegalArgumentException("Categoria inválida.");
        if (preco < 0) throw new IllegalArgumentException("Preço não pode ser negativo.");
        if (estoque < 0) throw new IllegalArgumentException("Estoque não pode ser negativo.");
        if (imagem == null || imagem.isEmpty()) throw new IllegalArgumentException("Imagem inválida.");

        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.tamanho = tamanho;
        this.cor = cor;
        this.preco = preco;
        this.estoque = estoque;
        this.imagem = imagem;
    }

    public void reduzirEstoque(int quantidadeVendida) {
        if (quantidadeVendida > this.estoque) {
            throw new IllegalArgumentException("Estoque insuficiente.");
        }
        this.estoque -= quantidadeVendida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
