package br.cefetrj.to.output;
import java.io.Serializable;
import br.cefetrj.model.Vendedor;
public class VendedorToOutput {
    
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
    public VendedorToOutput(Vendedor vendedor){
        this.id=vendedor.getId();
        this.nome=vendedor.getNome();
        this.senha=vendedor.getSenha();
    }
}

