package br.cefetrj.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.cefetrj.model.Produto;
import br.cefetrj.repository.ProdutoRepository;

@Service
public class ProdutoService {
    protected ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto save(Produto entity) {
        return repository.save(entity);
    }

    public Produto update(Produto entity) {
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Optional<Produto> findById(Integer id) {
        return repository.findById(id);
    }

    public List<Produto> findAll() {

        return repository.findAll();
    }
}