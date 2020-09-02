package br.com.cupom.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TB_PESSOA_JURIDICA")
@Data
public class PessoaJuridica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nr_cnpj")
    private long numCnpj;

    @Column(name = "num_ie")
    private long numIE;

    @Column(name = "razao_social")
    private String razaoSocial;

    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    @Embedded
    private Endereco endereco;


}
