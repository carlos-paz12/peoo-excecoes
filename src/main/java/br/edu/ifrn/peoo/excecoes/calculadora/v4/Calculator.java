package br.edu.ifrn.peoo.excecoes.calculadora.v4;

public class Calculator {

    public static int divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {

            throw new DivideByZeroException();

        } else {

            return a / b;

        }
    }

}
