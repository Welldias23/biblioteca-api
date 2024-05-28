package br.com.welldias.wellBiblioteca.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


public class Resultados {
    private int id;
    private String title;
    private List<Autor> authors;
    private List<String> translators;
    private List<String> subjects;
    private List<String> bookshelves;
    private List<String> languages;
    private Boolean copyright;
    private String media_type;
    private Object formats;
    private int download_count;

    public Resultados() {
    }

    public Resultados(int id, String title, List<Autor> authors, List<String> translators, List<String> subjects, List<String> bookshelves, List<String> languages, Boolean copyright, String media_type, Object formats, int download_count) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.translators = translators;
        this.subjects = subjects;
        this.bookshelves = bookshelves;
        this.languages = languages;
        this.copyright = copyright;
        this.media_type = media_type;
        this.formats = formats;
        this.download_count = download_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Autor> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Autor> authors) {
        this.authors = authors;
    }

    public List<String> getTranslators() {
        return translators;
    }

    public void setTranslators(List<String> translators) {
        this.translators = translators;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<String> getBookshelves() {
        return bookshelves;
    }

    public void setBookshelves(List<String> bookshelves) {
        this.bookshelves = bookshelves;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public Boolean getCopyright() {
        return copyright;
    }

    public void setCopyright(Boolean copyright) {
        this.copyright = copyright;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public Object getFormats() {
        return formats;
    }

    public void setFormats(Object formats) {
        this.formats = formats;
    }

    public int getDownload_count() {
        return download_count;
    }

    public void setDownload_count(int download_count) {
        this.download_count = download_count;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                ", translators=" + translators +
                ", subjects=" + subjects +
                ", bookshelves=" + bookshelves +
                ", languages=" + languages +
                ", copyright=" + copyright +
                ", media_type='" + media_type + '\'' +
                ", formats=" + formats +
                ", download_count=" + download_count;
    }
}

