package br.cefetrj.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import br.cefetrj.model.Gerente;

@Repository
public interface GerenteRepository extends JpaRepository<Gerente, Integer>, JpaSpecificationExecutor<Gerente> {

}
