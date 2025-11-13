package br.cefetrj.to.output;

import br.cefetrj.model.Gerente;

public class GerenteToOutput {
    private Integer id;
    private String nome;
    private String senha;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
    public GerenteToOutput(Gerente gerente){
        this.id=gerente.getId();
        this.nome=gerente.getNome();
        this.senha=gerente.getSenha();
    }
    
    
}
