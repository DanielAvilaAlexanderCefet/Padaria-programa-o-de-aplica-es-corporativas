package br.cefetrj.Service;

import java.util.List;
import java.util.Optional;

import br.cefetrj.model.Industrializado;
import br.cefetrj.repository.IndustrializadoRepository;


public class IndustrializadoService {
    protected IndustrializadoRepository repository;

    public IndustrializadoService(IndustrializadoRepository repository) {
        this.repository = repository;
    }

    public Industrializado save(Industrializado entity) {
        return repository.save(entity);
    }

    public Industrializado update(Industrializado entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Optional<Industrializado> findById(Integer id) {
        return repository.findById(id);
    }

    public List<Industrializado> findAll() {

        return repository.findAll();
    }
}