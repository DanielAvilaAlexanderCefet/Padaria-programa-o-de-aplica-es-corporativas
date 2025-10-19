package br.cefetrj.model;
public class Industrializado extends Produto {
    public String fornecedor;
    public Industrializado(String nome,int preco,int quantidade,String fornecedor){
        super(nome,preco,quantidade);
        this.fornecedor=fornecedor;
    }
}
