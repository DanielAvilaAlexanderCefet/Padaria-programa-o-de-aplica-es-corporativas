package br.cefetrj.model;
public class Produto extends Entidade  {
    public int quantidade;
    public String nome;
    public double preco;

    
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
