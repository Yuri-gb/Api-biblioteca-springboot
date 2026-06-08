package com.yurigb.library_api.controller;

import com.yurigb.library_api.model.Livro;
import com.yurigb.library_api.service.LivroService;

import org.hibernate.validator.constraints.URL;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @PostMapping
    public Livro criarLivro(
            @RequestBody Livro livro
    ) {
        return service.criarLivro(livro);
    }

    @GetMapping
    public List<Livro> listarLivros() {
        return service.listarLivros();
    }

    @GetMapping("/genero/{genero}")
    public List<Livro> listarLivrosPorGenero(@PathVariable String genero) {
        return service.listarLivrosPorGenero(genero);
    }

    @PutMapping("/{id}")
    public Livro atualizarLivro(@PathVariable Long id, @RequestBody Livro livroAtualizado) {
        return service.atualizarLivro(id, livroAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletarLivro(@PathVariable Long id) {
        service.deletarLivro(id);
    }
}