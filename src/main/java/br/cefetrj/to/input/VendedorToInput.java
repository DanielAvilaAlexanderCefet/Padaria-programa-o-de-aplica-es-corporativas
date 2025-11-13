package br.cefetrj.to.input;

import br.cefetrj.model.Vendedor;

public class VendedorToInput {
        private String nome;
    private String senha;
    private Integer id;
    public VendedorToInput()
    {
        
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Vendedor build(){
        var vendedor = new Vendedor();
        vendedor.setId(id);
        vendedor.setNome(nome);
        return vendedor;
}
}
