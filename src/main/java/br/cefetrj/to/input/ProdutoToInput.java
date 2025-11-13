package br.cefetrj.to.input;

import br.cefetrj.model.Produto;

public class ProdutoToInput {
    private String nome;
    private Integer id;
    public ProdutoToInput()
    {

    }
    public String getNome() {
        return nome;
    }
    public Integer getId() {
        return id;
    }
    public Produto build()
    {
        var produto = new Produto();
        produto.setId(id);
        produto.setNome(nome);
        return produto;
    }
    
}
