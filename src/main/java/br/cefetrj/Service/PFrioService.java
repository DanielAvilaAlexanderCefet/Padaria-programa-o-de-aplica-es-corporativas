package br.cefetrj.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.cefetrj.model.PFrio;
import br.cefetrj.repository.PFrioRepository;

@Service
public class PFrioService {
    protected PFrioRepository repository;

    public PFrioService(PFrioRepository repository) {
        this.repository = repository;
    }

    public PFrio save(PFrio entity) {
        return repository.save(entity);
    }

    public PFrio update(PFrio entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Optional<PFrio> findById(Integer id) {
        return repository.findById(id);
    }

    public List<PFrio> findAll() {

        return repository.findAll();
    }
}