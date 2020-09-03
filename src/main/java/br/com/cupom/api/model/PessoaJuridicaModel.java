package br.com.cupom.api.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@JacksonXmlRootElement(localName = "pessoaJuridica")
public class PessoaJuridicaModel {

    @JsonProperty("CNPJ")
    @NotNull
    private long numCnpj;

    @JsonProperty("IE")
    @NotNull
    private long numIE;

    @JsonProperty("xNome")
    @NotNull
    private String razaoSocial;

    @JsonProperty("xFant")
    @NotNull
    private String nomeFantasia;

    @JsonProperty("enderEmit")
    @NotNull
    private EnderecoModel endereco;

}
