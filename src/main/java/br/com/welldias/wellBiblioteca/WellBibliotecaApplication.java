package br.com.welldias.wellBiblioteca;

import br.com.welldias.wellBiblioteca.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WellBibliotecaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WellBibliotecaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			Principal principal = new Principal();
			principal.exibeMenu();
		}
}
