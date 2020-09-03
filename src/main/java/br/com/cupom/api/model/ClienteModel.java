package br.com.cupom.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

@Data
@JsonRootName(value = "cliente")
public class ClienteModel {

    @JsonProperty(value = "pessoaJuridica")
    private PessoaJuridicaModel pessoaJuridica;

}
