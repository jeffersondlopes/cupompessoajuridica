package br.com.cupom.api.assembler;

import br.com.cupom.api.model.ClienteModel;
import br.com.cupom.api.model.PessoaJuridicaModel;
import br.com.cupom.model.Cliente;
import br.com.cupom.model.PessoaJuridica;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PessoaInputDissambler {

    @Autowired
    private ModelMapper modelMapper;

    public PessoaJuridica toDomainObject(PessoaJuridicaModel pessoaJuridicaModel){
        return modelMapper.map(pessoaJuridicaModel, PessoaJuridica.class);
    }

    public Cliente toDomainObject(ClienteModel clienteModel){
        return modelMapper.map(clienteModel, Cliente.class);
    }

    public PessoaJuridicaModel toModelObject(PessoaJuridica pessoa){
        return modelMapper.map(pessoa, PessoaJuridicaModel.class);
    }

    public ClienteModel toModelObject(Cliente cliente){
        return modelMapper.map(cliente, ClienteModel.class);
    }

}
