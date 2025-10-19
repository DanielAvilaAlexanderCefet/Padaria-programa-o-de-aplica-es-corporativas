package br.cefetrj.model;

public class Cliente extends Entidade {
    public String nome;
    public Integer idade;

    public Cliente(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
