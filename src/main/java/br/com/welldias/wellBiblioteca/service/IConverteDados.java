package br.com.welldias.wellBiblioteca.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
