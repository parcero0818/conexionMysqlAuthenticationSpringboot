package co.com.tienda.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.com.tienda.api.model.Tinstrumentos;

public interface TinstrumentosRepositorio extends JpaRepository<Tinstrumentos, Long>{
	
	@Query("select u from Tinstrumentos u where u.codigo like %?1%")
	Tinstrumentos findByNombrel(String nombre);

}
