package br.com.cupom.model;

import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "TB_CLIENTE")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @UpdateTimestamp
    @Column(name = "DT_CADASTRO")
    private OffsetDateTime dtCadastro;

    @ManyToOne
    @JoinColumn(name="id_pj")
    private PessoaJuridica pessoaJuridica;


}
