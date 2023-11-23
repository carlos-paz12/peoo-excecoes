package br.edu.ifrn.peoo.excecoes.calculadora.v3;

public class Calculator {

    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {

            throw new ArithmeticException("cannot divide by zero");

        } else {

            return a / b;

        }
    }

}
