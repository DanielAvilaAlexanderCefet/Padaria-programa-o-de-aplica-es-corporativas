package br.cefetrj.to.output;

import br.cefetrj.model.Produto;

public class ProdutoToOutput {
    private String nome;
    private Integer id;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public ProdutoToOutput(Produto produto)
    {
        this.nome=produto.getNome();
        this.id=produto.getId();
    }   
}
