package br.api.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.api.rest.model.Resultado;

@Repository
public interface ResultadoRepository extends CrudRepository<Resultado, Long> {
	
	

}
