package br.com.cupom.exception;

public class EntidadeNaoEncontradoException extends RuntimeException {

    public static final String MSG = "Entidade %d não encontrada";

    public EntidadeNaoEncontradoException(Long ean){
        super(String.format(MSG,ean));
    }

}
