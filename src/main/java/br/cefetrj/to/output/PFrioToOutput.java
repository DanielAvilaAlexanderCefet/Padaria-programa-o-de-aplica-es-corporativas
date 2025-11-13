package br.cefetrj.to.output;

import br.cefetrj.model.PFrio;

public class PFrioToOutput {
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
    public PFrioToOutput(PFrio pFrio)
    {
        this.nome=pFrio.getNome();
        this.id=pFrio.getId();
    }     
}
