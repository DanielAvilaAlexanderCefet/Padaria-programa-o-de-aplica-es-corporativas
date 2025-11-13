package br.cefetrj.Dao;
import br.cefetrj.model.Cliente;
public class ClienteDao extends GenericDAO<Cliente> {
    
    public ClienteDao()
    {
        super(Cliente.class);
    }
    
}
