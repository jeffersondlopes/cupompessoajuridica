package br.com.cupom.exception;

public class EntidadeCadastradoException extends RuntimeException {

    public static final String MSG = "Entidade %d já cadastrado !";

    public EntidadeCadastradoException(Long ean){
        super(String.format(MSG,ean));
    }

}
