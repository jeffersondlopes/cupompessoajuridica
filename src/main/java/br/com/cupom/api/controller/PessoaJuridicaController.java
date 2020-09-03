package br.com.cupom.api.controller;

import br.com.cupom.api.assembler.PessoaInputDissambler;
import br.com.cupom.api.model.PessoaJuridicaModel;
import br.com.cupom.model.PessoaJuridica;
import br.com.cupom.service.PessoaJuridicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("pess_jur")
public class PessoaJuridicaController {

    @Autowired
    private PessoaInputDissambler pJInputDissambler;

    @Autowired
    private PessoaJuridicaService pJService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PessoaJuridicaModel cadastrar(@RequestBody @Valid PessoaJuridicaModel pessoaJuridicaModel){
        PessoaJuridica pessoaJuridica = pJInputDissambler.toDomainObject(pessoaJuridicaModel);
        pessoaJuridica = pJService.salvar(pessoaJuridica);
        return pJInputDissambler.toModelObject(pessoaJuridica);
    }

    @GetMapping("/{numCnpj}")
    @ResponseStatus(HttpStatus.OK)
    public PessoaJuridicaModel buscar(@PathVariable("numCnpj") Long numCnpj){
        PessoaJuridica pessoaJuridica = pJService.buscar(numCnpj);
        return pJInputDissambler.toModelObject(pessoaJuridica);
    }


}
