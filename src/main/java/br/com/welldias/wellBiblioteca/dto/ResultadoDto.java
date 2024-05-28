package br.com.welldias.wellBiblioteca.dto;

import br.com.welldias.wellBiblioteca.model.Resultados;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ResultadoDto (@JsonAlias("results") List<LivroDto> resultados) {
}
