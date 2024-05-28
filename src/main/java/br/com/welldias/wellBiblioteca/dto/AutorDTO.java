package br.com.welldias.wellBiblioteca.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AutorDTO(
        @JsonAlias("name")
        String nome,

        @JsonAlias("birth_year")
        String dataNascimento,

        @JsonAlias("death_year")
        String dataFalecimento) {
}
