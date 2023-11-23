package br.edu.ifrn.peoo.excecoes.calculadora.v3;

public class Test {

    public static void main(String[] args) {
        try {

            System.out.println(Calculator.divide(2, 0));

        } catch (ArithmeticException exception) {

            System.out.println(exception.getMessage());

        }
    }

}
