package br.edu.ifrn.peoo.excecoes.calculadora.v4;

public class Test {

    public static void main(String[] args) {
        try {

            System.out.println(Calculator.divide(2, 0));

        } catch (DivideByZeroException exception) {

            System.out.println(exception.getMessage());

        }
    }

}
