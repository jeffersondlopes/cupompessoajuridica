package br.com.cupom.service;

import br.com.cupom.exception.EntidadeCadastradoException;
import br.com.cupom.exception.EntidadeNaoEncontradoException;
import br.com.cupom.model.PessoaJuridica;
import br.com.cupom.repository.PessoaJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaJuridicaService {

    @Autowired
    private PessoaJuridicaRepository pJRepository;

    public PessoaJuridica salvar(PessoaJuridica pessoa) {
        if (pJRepository.existsByNumCnpj(pessoa.getNumCnpj())){
            throw new EntidadeCadastradoException(pessoa.getNumCnpj());
        }
        return this.pJRepository.save(pessoa);
    }


    public PessoaJuridica buscar(Long numCnpj){
        Optional<PessoaJuridica> pessoa = pJRepository.findByNumCnpj(numCnpj);
        return pessoa.orElseThrow(() -> new EntidadeNaoEncontradoException(numCnpj));
    }

}
