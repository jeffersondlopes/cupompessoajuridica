package br.com.cupom.repository;

import br.com.cupom.model.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {

    public boolean existsByNumCnpj(Long numCnpj);

    public Optional<PessoaJuridica> findByNumCnpj(Long numCnpj);
}
