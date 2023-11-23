package br.edu.ifrn.peoo.excecoes.calculadora.v4;

public class DivideByZeroException extends Exception {

    public DivideByZeroException() {
        super("cannot divide by zero");
    }

    public DivideByZeroException(String message) {
        super(message);
    }

}
