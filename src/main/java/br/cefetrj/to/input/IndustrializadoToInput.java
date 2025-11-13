package br.cefetrj.to.input;

import br.cefetrj.model.Industrializado;

public class IndustrializadoToInput {
    private String nome;
    private Integer id;
    public IndustrializadoToInput()
    {

    }
    public String getNome() {
        return nome;
    }
    public Integer getId() {
        return id;
    }
    public Industrializado build()
    {
        var industrializado = new Industrializado();
        industrializado.setId(id);
        industrializado.setNome(nome);
        return industrializado;
    }
}
