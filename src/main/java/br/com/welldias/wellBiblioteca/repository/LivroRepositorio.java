package br.com.welldias.wellBiblioteca.repository;

import br.com.welldias.wellBiblioteca.model.Autor;
import br.com.welldias.wellBiblioteca.model.Livro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LivroRepositorio extends CrudRepository<Livro, Long> {
    @Override
    List<Livro> findAll();

    @Query("SELECT a FROM Autor a")
    List<Autor> findAllArtista();

    @Query("SELECT a FROM Autor a WHERE a.dataNascimento <= :ano AND a.dataFalecimento >= :ano")
    List<Autor> autoresVivos(int ano);

    @Query("SELECT l FROM Livro l WHERE l.idioma ILIKE :idioma")
    List<Livro> buscarLivroIdioma(String idioma);
}
