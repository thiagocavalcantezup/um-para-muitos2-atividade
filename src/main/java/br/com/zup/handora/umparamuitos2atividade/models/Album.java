package br.com.zup.handora.umparamuitos2atividade.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "albuns")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false, length = 500)
    private String descricao;

    @Column(nullable = false)
    @Min(10)
    @Max(100)
    private Integer numeroDePaginas;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "album")
    private Set<Figurinha> figurinhas = new HashSet<>();

    /**
     * @deprecated Construtor de uso exclusivo do Hibernate
     */
    @Deprecated
    public Album() {}

    public Album(String titulo, String descricao, @Min(10) @Max(100) Integer numeroDePaginas) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void adicionar(Figurinha figurinha) {
        figurinha.setAlbum(this);
        figurinhas.add(figurinha);
    }

    public Long getId() {
        return id;
    }

    public Set<Figurinha> getFigurinhas() {
        return figurinhas;
    }

}
