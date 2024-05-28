package br.com.welldias.wellBiblioteca.principal;

import br.com.welldias.wellBiblioteca.dto.LivroDto;
import br.com.welldias.wellBiblioteca.dto.ResultadoDto;
import br.com.welldias.wellBiblioteca.model.Autor;
import br.com.welldias.wellBiblioteca.model.Livro;
import br.com.welldias.wellBiblioteca.service.ConsumoApi;
import br.com.welldias.wellBiblioteca.service.ConverteDados;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;

public class Principal {
    private ObjectMapper mapper = new ObjectMapper();
    Scanner leitura = new Scanner(System.in);
    private final String URL_BASE = "https://gutendex.com/books/?search=";
    private int opcao = -1;
    ConsumoApi consumoApi = new ConsumoApi();

    public void exibeMenu() {
        var menu = """
                ********************************
                Escolha o numero da sua opcao:
                
                1- Buscar livro pelo titulo
                2- Listar livros registrados
                3- Listar autores registrados
                4- Listar autores vivos em um determinado ano
                5- Listar livros em um determinado idioma
                0- Sair
                
                ********************************
                """;

    while (opcao != 0) {
        System.out.println(menu);
        opcao = leitura.nextInt();
        leitura.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Insira o nome de livro que voce deseja buscar: ");

                var livroBuscado = leitura.nextLine();
                String livroJson = consumoApi.obterDados(URL_BASE + livroBuscado.toLowerCase().replace(" ", "+"));

                System.out.println(livroJson);

                ConverteDados conversorJsonParaClasse = new ConverteDados();

                ResultadoDto livroDto = conversorJsonParaClasse.obterDados(livroJson, ResultadoDto.class);
                System.out.println(livroDto);
                var livro = new Livro(livroDto.resultados());
                var autor = new Autor(livro.getAutores());
                System.out.println(autor);
                System.out.println(livro);
        }

    }
        System.out.println("Programa encerrado!");
    }

}
