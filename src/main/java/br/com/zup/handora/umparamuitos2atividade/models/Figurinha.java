package br.com.zup.handora.umparamuitos2atividade.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "figurinhas")
public class Figurinha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Positive
    private Integer pagina;

    @Column(nullable = false)
    private String descricao;

    @ManyToOne(optional = false)
    private Album album;

    /**
     * @deprecated Construtor de uso exclusivo do Hibernate
     */
    @Deprecated
    public Figurinha() {}

    public Figurinha(Integer pagina, String descricao) {
        this.pagina = pagina;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

}
