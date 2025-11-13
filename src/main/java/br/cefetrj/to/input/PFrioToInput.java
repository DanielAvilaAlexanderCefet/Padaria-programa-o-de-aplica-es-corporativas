package br.cefetrj.to.input;

import br.cefetrj.model.PFrio;

public class PFrioToInput {
    private String nome;
    private Integer id;
    public PFrioToInput()
    {

    }
    public String getNome() {
        return nome;
    }
    public Integer getId() {
        return id;
    }
    public PFrio build()
    {
        var pFrio = new PFrio();
        pFrio.setId(id);
        pFrio.setNome(nome);
        return pFrio;
    }
}
