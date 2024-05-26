package br.com.welldias.wellBiblioteca.model;

public class Autor {
    private String name;
    private String birth_year;
    private String death_year;

    public Autor() {
    }

    public Autor(String name, String birth_year, String death_year) {
        this.name = name;
        this.birth_year = birth_year;
        this.death_year = death_year;
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
        return "name='" + name +
                ", birth_year='" + birth_year +
                ", death_year='" + death_year;
    }
}
