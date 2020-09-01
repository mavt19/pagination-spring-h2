package pe.com.vera.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import pe.com.vera.entity.Pais;
import pe.com.vera.service.PaisService;

@RestController
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class PaisController {

	private final PaisService<Pais> _services;
	
	@PostMapping("/paises")
	public ResponseEntity<Page<Pais>> paginas(
			@RequestParam(defaultValue = "0")int page,
			@RequestParam(defaultValue = "5")int size,
			@RequestParam(defaultValue = "nombrePais")String order,
			@RequestParam(defaultValue = "true")boolean asc){
		Page<Pais> paises = _services.paginas(
				PageRequest.of(page, size, Sort.by(order)));
				if(!asc)paises = _services.paginas(
						PageRequest.of(page, size, Sort.by(order).descending())
				);
				
		return new ResponseEntity<Page<Pais>>(paises,HttpStatus.OK);

	}
}