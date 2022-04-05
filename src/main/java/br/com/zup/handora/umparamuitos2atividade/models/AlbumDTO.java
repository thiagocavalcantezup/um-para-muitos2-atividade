package br.com.zup.handora.umparamuitos2atividade.models;

import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AlbumDTO {

    @NotBlank
    private String titulo;

    @NotBlank
    @Size(max = 500)
    private String descricao;

    @NotNull
    @Min(10)
    @Max(100)
    private Integer numeroDePaginas;

    @Valid
    @NotEmpty
    private Set<FigurinhaDTO> figurinhas;

    public AlbumDTO(@NotBlank String titulo, @NotBlank @Size(max = 500) String descricao,
                    @NotNull @Min(10) @Max(100) Integer numeroDePaginas,
                    @NotEmpty Set<FigurinhaDTO> figurinhas) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.numeroDePaginas = numeroDePaginas;
        this.figurinhas = figurinhas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public Set<FigurinhaDTO> getFigurinhas() {
        return figurinhas;
    }

}
