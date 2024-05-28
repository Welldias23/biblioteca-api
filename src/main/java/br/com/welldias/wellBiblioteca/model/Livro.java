package br.com.welldias.wellBiblioteca.model;

import br.com.welldias.wellBiblioteca.dto.AutorDTO;
import br.com.welldias.wellBiblioteca.dto.LivroDto;

import java.util.List;

public class Livro {
    private int id;
    private String titulo;
    private List<AutorDTO> autores;
    private List<String> idiomas;
    private int numeroDownloads;

    //public Livro() {}

    public Livro(List<LivroDto> livroDto) {
        this.titulo = livroDto.get(0).titulo();
        this.autores = livroDto.get(0).autorDTOList();
        this.idiomas = livroDto.get(0).idioma();
        this.numeroDownloads = Integer.parseInt(livroDto.get(0).totalDownloads());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<AutorDTO> getAutores() {
        return autores;
    }

    public void setAutores(List<AutorDTO> autores) {
        this.autores = autores;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    public int getNumeroDownloads() {
        return numeroDownloads;
    }

    public void setNumeroDownloads(int numeroDownloads) {
        this.numeroDownloads = numeroDownloads;
    }

    @Override
    public String toString() {
        return "titulo ='" + titulo +
                ", autores =" + autores +
                ", Idiomas =" + idiomas +
                ", numeroDownloads =" + numeroDownloads;
    }
}
