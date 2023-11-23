package br.edu.ifrn.peoo.excecoes.calculadora.v2;

public class Calculator {

    public static int divide(int a, int b) {
        try {

            return a / b;

        } catch (ArithmeticException exception) {

            System.out.println("cannot divide by zero");
            return 0;

        }
    }

}
