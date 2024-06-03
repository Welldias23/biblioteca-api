package br.com.welldias.wellBiblioteca.model;

import br.com.welldias.wellBiblioteca.dto.AutorDTO;
import br.com.welldias.wellBiblioteca.dto.LivroDto;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Autor autor;
    private String idioma;
    private int numeroDownloads;

    public Livro() {}

    public Livro(LivroDto livroDto) {
        this.titulo = livroDto.titulo();
        this.autor = new Autor(livroDto.autorDTOList().get(0));
        this.idioma = livroDto.idioma().getFirst();
        this.numeroDownloads = Integer.parseInt(livroDto.totalDownloads());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutores(Autor autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getNumeroDownloads() {
        return numeroDownloads;
    }

    public void setNumeroDownloads(int numeroDownloads) {
        this.numeroDownloads = numeroDownloads;
    }

    @Override
    public String toString() {
        return "titulo = " + titulo +
                "\nautor = " + autor +
                "\nIdiomas = " + idioma +
                "\nnumeroDownloads = " + numeroDownloads;
    }
}
