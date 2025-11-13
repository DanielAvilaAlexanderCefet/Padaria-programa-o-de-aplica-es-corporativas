package br.cefetrj.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.cefetrj.model.Gerente;
import br.cefetrj.repository.GerenteRepository;

@Service
public class GerenteService {
    protected GerenteRepository repository;

    public GerenteService(GerenteRepository repository) {
        this.repository = repository;
    }

    public Gerente save(Gerente entity) {
        return repository.save(entity);
    }

    public Gerente update(Gerente entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Optional<Gerente> findById(Integer id) {
        return repository.findById(id);
    }

    public List<Gerente> findAll() {

        return repository.findAll();
    }
}