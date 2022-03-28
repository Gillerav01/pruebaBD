package es.prueba.spring.main.modelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolUsuario extends CrudRepository<RolUsuario, Integer>{
	
}
