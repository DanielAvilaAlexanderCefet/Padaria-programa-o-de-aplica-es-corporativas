package br.cefetrj.Dao;


import br.cefetrj.model.Produto;

public class ProdutoDAO extends GenericDAO<Produto> {
    public ProdutoDAO()
    {
        super(Produto.class);
    }
}
