package br.com.cupom.repository;

import br.com.cupom.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public Boolean existsByPessoaJuridicaNumCnpj(Long numCnpj);

    public Optional<Cliente> findByPessoaJuridicaNumCnpj(Long numCnpj);



}
