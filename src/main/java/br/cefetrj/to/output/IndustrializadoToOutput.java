package br.cefetrj.to.output;

import br.cefetrj.model.Industrializado;

public class IndustrializadoToOutput {
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
    public IndustrializadoToOutput(Industrializado industrializado)
    {
        this.nome=industrializado.getNome();
        this.id=industrializado.getId();
    } 
}
