package br.com.welldias.wellBiblioteca.model;

import br.com.welldias.wellBiblioteca.dto.AutorDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String birth_year;
    private String death_year;

    public Autor() {}

    public Autor(List<AutorDTO> autorDTO) {
        this.name = autorDTO.get(0).nome();
        this.birth_year = autorDTO.get(0).dataNascimento();
        this.death_year = autorDTO.get(0).dataFalecimento();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getDeath_year() {
        return death_year;
    }

    public void setDeath_year(String death_year) {
        this.death_year = death_year;
    }

    @Override
    public String toString() {
        return "Nome = " + name + ", " +
                "Ano de nascimento = " + birth_year + ", " +
                "Ano da morte = " + death_year;
    }
}
