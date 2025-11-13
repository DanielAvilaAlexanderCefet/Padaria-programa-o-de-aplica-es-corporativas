package br.cefetrj.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import br.cefetrj.model.Industrializado;

@Repository
public interface IndustrializadoRepository extends JpaRepository<Industrializado, Integer>, JpaSpecificationExecutor<Industrializado> {

}
