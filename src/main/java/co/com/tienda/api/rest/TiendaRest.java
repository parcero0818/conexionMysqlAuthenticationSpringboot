package co.com.tienda.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.tienda.api.model.Tinstrumentos;
import co.com.tienda.api.repositorio.TinstrumentosRepositorio;

@RestController
@RequestMapping("/tienda")
public class TiendaRest {

	@Autowired
	TinstrumentosRepositorio repositorrio;

	@GetMapping
	public List<Tinstrumentos> getInstrumentos() {
		return repositorrio.findAll();
	}

	@PostMapping(value = "/addInstrumento")
	public ResponseEntity<?> addInstrumento(@RequestBody Tinstrumentos instrumentos) {
		try {
			repositorrio.save(instrumentos);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			// TODO: handle exception
		}
		
	}
	
	@GetMapping(value = "/getInstrumento")
	public Tinstrumentos getInstrumentoNombre(@RequestParam("nombre") String nombre) {
		try {
			System.out.println("nombre "+ nombre);
			return repositorrio.findByNombrel(nombre);
		}catch (Exception e) {
			return null;
			// TODO: handle exception
		}
		
	}
	
	
	
}
