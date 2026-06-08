package com.yurigb.library_api.model;
import jakarta.persistence.*;


@Entity
@Table(name = "livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private String descricao;
    private String genero;

    public Livro(String titulo, String autor, String descricao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.descricao = descricao;
        this.genero = genero;
    }

    public Livro() {
    }

    public String getGenero() {
        return genero;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
