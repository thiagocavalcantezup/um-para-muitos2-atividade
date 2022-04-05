package br.com.zup.handora.umparamuitos2atividade.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class FigurinhaDTO {

    @NotNull
    private Integer pagina;

    @NotBlank
    private String descricao;

    public FigurinhaDTO(@NotNull Integer pagina, @NotBlank String descricao) {
        this.pagina = pagina;
        this.descricao = descricao;
    }

    public Integer getPagina() {
        return pagina;
    }

    public String getDescricao() {
        return descricao;
    }

}
