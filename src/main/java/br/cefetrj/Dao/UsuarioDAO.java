package br.cefetrj.Dao;

import br.cefetrj.model.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario> {
    public UsuarioDAO()
    {
        super(Usuario.class);
    }
}
