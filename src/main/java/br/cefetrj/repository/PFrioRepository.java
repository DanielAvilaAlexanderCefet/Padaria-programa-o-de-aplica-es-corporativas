package br.cefetrj.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import br.cefetrj.model.PFrio;

@Repository
public interface PFrioRepository extends JpaRepository<PFrio, Integer>, JpaSpecificationExecutor<PFrio> {

}
