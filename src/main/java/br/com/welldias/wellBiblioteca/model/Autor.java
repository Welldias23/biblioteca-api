package br.com.welldias.wellBiblioteca.model;

import br.com.welldias.wellBiblioteca.dto.AutorDTO;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nome;
    private int dataNascimento;
    private int dataFalecimento;
    @OneToMany(mappedBy = "autor")
    private List<Livro> livros = new ArrayList<>();

    public Autor() {}

    public Autor(AutorDTO autorDTO) {
        this.nome = autorDTO.nome();
        this.dataNascimento = Integer.parseInt(autorDTO.dataNascimento());
        this.dataFalecimento = Integer.parseInt(autorDTO.dataFalecimento());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getDataFalecimento() {
        return dataFalecimento;
    }

    public void setDataFalecimento(int dataFalecimento) {
        this.dataFalecimento = dataFalecimento;
    }

    @Override
    public String toString() {
        return  nome + ", " +
                "Ano de nascimento = " + dataNascimento + ", " +
                "Ano da morte = " + dataFalecimento;
    }
}
