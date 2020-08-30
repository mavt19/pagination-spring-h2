package pe.com.vera.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import pe.com.vera.entity.Pais;
import pe.com.vera.repository.PaisRepository;

@Service
@AllArgsConstructor
@Transactional
public class PaisServiceImpl implements PaisService<Pais>{

	private final PaisRepository repository;
	@Override
	public Page<Pais> paginas(Pageable pageable) {
		// TODO Auto-generated method stub
		return repository.findAll(pageable);
	}

}
