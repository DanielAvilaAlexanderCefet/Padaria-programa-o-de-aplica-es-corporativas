package br.cefetrj.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.cefetrj.model.Vendedor;
import br.cefetrj.repository.VendedorRepository;

@Service
public class VendedorService {
    protected VendedorRepository repository;

    public VendedorService(VendedorRepository repository) {
        this.repository = repository;
    }

    public Vendedor save(Vendedor entity) {
        return repository.save(entity);
    }

    public Vendedor update(Vendedor entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Optional<Vendedor> findById(Integer id) {
        return repository.findById(id);
    }

    public List<Vendedor> findAll() {

        return repository.findAll();
    }
}