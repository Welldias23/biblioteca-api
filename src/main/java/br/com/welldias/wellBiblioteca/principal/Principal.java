package br.com.welldias.wellBiblioteca.principal;

import br.com.welldias.wellBiblioteca.dto.ResultadoDto;
import br.com.welldias.wellBiblioteca.model.Autor;
import br.com.welldias.wellBiblioteca.model.Livro;
import br.com.welldias.wellBiblioteca.repository.LivroRepositorio;
import br.com.welldias.wellBiblioteca.service.ConsumoApi;
import br.com.welldias.wellBiblioteca.service.ConverteDados;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
    private ObjectMapper mapper = new ObjectMapper();
    Scanner leitura = new Scanner(System.in);
    private final String URL_BASE = "https://gutendex.com/books/?search=";
    private int opcao = -1;
    ConsumoApi consumoApi = new ConsumoApi();

    private LivroRepositorio repositorio;

    public Principal(LivroRepositorio repositorio) {
        this.repositorio = repositorio;
    }


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
                buscarLivro();
                break;
            case 2:
                listarLivros();
                break;
            case 3:
                listrarAutores();
                break;
            case 4:
                listarAutoresVivosAno();
                break;
            case 5:
                buscarLivroIdioma();
        }

    }
        System.out.println("Programa encerrado!");
    }

    private void buscarLivro() {
        System.out.println("Insira o nome de livro que voce deseja buscar: ");

        var livroBuscado = leitura.nextLine();
        String livroJson = consumoApi.obterDados(URL_BASE + livroBuscado.toLowerCase().replace(" ", "+"));


        ConverteDados conversorJsonParaClasse = new ConverteDados();

        ResultadoDto livroDto = conversorJsonParaClasse.obterDados(livroJson, ResultadoDto.class);
        System.out.println(livroDto);
        var livro = new Livro(livroDto.resultados().get(0));
        repositorio.save(livro);
        System.out.println(livro);
    }

    private Iterable<Livro> listarLivros() {
        Iterable<Livro> livrosCadastrados = repositorio.findAll();
        System.out.println(livrosCadastrados);
        return livrosCadastrados;
    }

    private void listrarAutores() {
        List<Autor> autoresCadastrados = repositorio.findAllArtista();
        System.out.println(autoresCadastrados);
    }

    private void listarAutoresVivosAno(){
        System.out.println("Digite um ano:" );
        int ano = leitura.nextInt();
        leitura.nextLine();
        List<Autor> autoresVivos = repositorio.autoresVivos(ano);
        System.out.println(autoresVivos);
    }

    private void buscarLivroIdioma() {
        System.out.println("Digite o idioma: ");
        String idioma = leitura.nextLine();
        List<Livro> livroIdioma = repositorio.buscarLivroIdioma(idioma);
        System.out.println(livroIdioma);
    }
}
