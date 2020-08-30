package pe.com.vera.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;




public interface PaisService<T> {

	public Page<T> paginas(Pageable pageable);

	default T save(T entity) {
		return null;
	}
	default T update(T entity) {
		return null;
	}
	default T findById(Long id) {
		return null;
	}
	default Iterable<T> findAll() {
		return null;
	}
	default void delete(Long id) {
		
	}
}
