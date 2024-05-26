package br.com.welldias.wellBiblioteca.model;

import java.util.List;

public class Livro {
    private int id;
    private String titulo;
    private List<Autor> autores;
    private List<String> Idiomas;
    private int numeroDownloads;

    public Livro(int id, String titulo, List<Autor> autores, List<String> idiomas, int numeroDownloads) {
        this.id = id;
        this.titulo = titulo;
        this.autores = autores;
        Idiomas = idiomas;
        this.numeroDownloads = numeroDownloads;
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

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<String> getIdiomas() {
        return Idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        Idiomas = idiomas;
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
                ", Idiomas =" + Idiomas +
                ", numeroDownloads =" + numeroDownloads;
    }
}
