package br.com.welldias.wellBiblioteca.principal;

import br.com.welldias.wellBiblioteca.model.ResultsApi;
import br.com.welldias.wellBiblioteca.service.ConsumoApi;
import br.com.welldias.wellBiblioteca.service.ConverteDados;

import java.util.Scanner;

public class Principal {
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
                String livroJson = consumoApi.obterDados(URL_BASE + livroBuscado);
                System.out.println(livroJson);

                ConverteDados conversorJsonParaClasse = new ConverteDados();

                ResultsApi livro = conversorJsonParaClasse.obterDados(livroJson, ResultsApi.class);
                System.out.println(livro);
        }

    }
        System.out.println("Programa encerrado!");
    }
}
