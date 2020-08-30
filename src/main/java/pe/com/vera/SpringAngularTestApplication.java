package pe.com.vera;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.com.vera.entity.Pais;
import pe.com.vera.repository.PaisRepository;

@SpringBootApplication
public class SpringAngularTestApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularTestApplication.class, args);
	}

	@Autowired
	PaisRepository _repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < 100; i++) {
			Pais p = new Pais();
			p.setNombrePais("pais " +i);
			p.setCapitalPais("capital "+i);
			_repository.save(p);
		}
	}

}
