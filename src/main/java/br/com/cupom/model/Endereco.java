package br.com.cupom.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class Endereco {

    @Column(name = "NOM_LOGRADOURO")
    private String nomLogradouro;

    @Column(name = "NUM_LOGRADOURO")
    private Long numLogradouro;

    @Column(name = "NOM_BAIRRO")
    private String dscBairro;

    @Column(name = "COD_MUNICIPIO")
    private Long codMunicipio;

    @Column(name = "NOM_MUCIPIO")
    private String nomeMunicipo;

    @Column(name = "COD_UF")
    private String codUF;

    @Column(name = "NUM_CEP")
    private Long numCEP;


}
