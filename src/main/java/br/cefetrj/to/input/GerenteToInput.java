package br.cefetrj.to.input;
import java.io.Serializable;
import br.cefetrj.model.Gerente;
public class GerenteToInput {
    private String nome;
    private String senha;
    private Integer id;
    public GerenteToInput()
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
    public Gerente build(){
        var gerente = new Gerente();
        gerente.setId(id);
        gerente.setNome(nome);
        return gerente;
    }
}
