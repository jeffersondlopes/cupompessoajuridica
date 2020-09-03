package br.com.cupom.service;

import br.com.cupom.exception.EntidadeCadastradoException;
import br.com.cupom.exception.EntidadeNaoEncontradoException;
import br.com.cupom.model.Cliente;
import br.com.cupom.model.PessoaJuridica;
import br.com.cupom.repository.ClienteRepository;
import br.com.cupom.repository.PessoaJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clineteRepository;

    @Autowired
    private PessoaJuridicaRepository pessoaRepository;

    public Cliente salvar(Cliente cliente){

        salvarPessoaJuridica(cliente);
        return clineteRepository.save(cliente);

    }

    private void salvarPessoaJuridica(Cliente cliente) {

        PessoaJuridica novoPessoaJuridica;

        Optional<PessoaJuridica> existePJCadastrado = this.pessoaRepository
                .findByNumCnpj(cliente.getPessoaJuridica().getNumCnpj());

        if (!existePJCadastrado.isPresent()){
            novoPessoaJuridica = pessoaRepository.save(cliente.getPessoaJuridica());
        } else{
            novoPessoaJuridica = existePJCadastrado.get();
        }

        Boolean existeClienteCadastrado = clineteRepository.existsByPessoaJuridicaNumCnpj(cliente
                .getPessoaJuridica().getNumCnpj());

        if (existeClienteCadastrado) {
            throw new EntidadeCadastradoException(cliente.getPessoaJuridica().getNumCnpj());
        } else {
            cliente.setPessoaJuridica(novoPessoaJuridica);
        }

    }

    public Cliente buscarCliente(Long numCnpj) {

        Optional<Cliente> cliente = clineteRepository.findByPessoaJuridicaNumCnpj(numCnpj);

        return cliente.orElseThrow(() -> new EntidadeNaoEncontradoException(numCnpj));
    }
}
