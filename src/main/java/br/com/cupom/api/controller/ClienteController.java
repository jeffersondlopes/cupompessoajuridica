package br.com.cupom.api.controller;

import br.com.cupom.api.assembler.PessoaInputDissambler;
import br.com.cupom.api.model.ClienteModel;
import br.com.cupom.model.Cliente;
import br.com.cupom.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @Autowired
    private PessoaInputDissambler dissambler;

    @PostMapping
    public ClienteModel novoCliente(@RequestBody ClienteModel cliente){
        Cliente clienteObject = dissambler.toDomainObject(cliente);
        Cliente novoCliente = service.salvar(clienteObject);
        ClienteModel clienteModel = dissambler.toModelObject(novoCliente);
        return clienteModel;
    }

    @GetMapping("/{numCnpj}")
    public ClienteModel buscarCliente(@PathVariable("numCnpj") Long numCnpj){
        Cliente cliente = service.buscarCliente(numCnpj);
        ClienteModel clienteModel = dissambler.toModelObject(cliente);
        return clienteModel;
    }

}
