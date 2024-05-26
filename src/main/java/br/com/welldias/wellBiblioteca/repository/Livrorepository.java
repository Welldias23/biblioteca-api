package br.com.welldias.wellBiblioteca.repository;

import br.com.welldias.wellBiblioteca.model.Livro;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;

public interface Livrorepository extends JpaAttributeConverter<Livro, Long> {
}
