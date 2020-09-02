package br.com.cupom.api.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class EnderecoModel {

    @JsonProperty("xLgr")
    @NotNull
    private String nomLogradouro;

    @JsonProperty("nro")
    @NotNull
    private Long numLogradouro;

    @JsonProperty("xBairro")
    @NotNull
    private String dscBairro;

    @JsonProperty("cMun")
    @NotNull
    private Long codMunicipio;

    @JsonProperty("xMun")
    @NotNull
    private String nomeMunicipo;

    @JsonProperty("UF")
    @NotNull
    private String codUF;

    @JsonProperty("CEP")
    @NotNull
    private Long numCEP;


}
