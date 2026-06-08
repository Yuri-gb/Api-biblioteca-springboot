package com.yurigb.library_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yurigb.library_api.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    List<Livro> findByGenero(String genero);
}