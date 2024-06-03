package br.com.welldias.wellBiblioteca;

import br.com.welldias.wellBiblioteca.principal.Principal;
import br.com.welldias.wellBiblioteca.repository.LivroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WellBibliotecaApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(WellBibliotecaApplication.class, args);
	}

	@Autowired
	private LivroRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
			Principal principal = new Principal(repositorio);
			principal.exibeMenu();
		}
}
