package com.yurigb.library_api.service;

import com.yurigb.library_api.model.Livro;
import com.yurigb.library_api.repository.LivroRepository;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository repository;

    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

    public Livro criarLivro(Livro livro) {
        return repository.save(livro);
    }

    public List<Livro> listarLivros() {
        return repository.findAll();
    }

    public List<Livro> listarLivrosPorGenero(String genero) {
        return repository.findByGenero(genero);
    }

    public Livro atualizarLivro(Long id, Livro livroAtualizado) {

        Livro livro = repository.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(
                                HttpStatus.NOT_FOUND,
                                "Livro não encontrado com id: " + id));

        livro.setTitulo(livroAtualizado.getTitulo());
        livro.setAutor(livroAtualizado.getAutor());
        livro.setDescricao(livroAtualizado.getDescricao());
        livro.setGenero(livroAtualizado.getGenero());

        return repository.save(livro);
}
    public void deletarLivro(Long id) {
        repository.deleteById(id);
    }

}