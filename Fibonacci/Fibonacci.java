package Fibonacci;

/*  1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
 (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de
 Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. */

public class Fibonacci {

    public static void isFibonacci(int number){

        int a = 0;
        int b = 1;
        int fib = b;

        while (fib < number){
            fib = a + b;
            a = b;
            b = fib;
        }
        if( fib == number){
            System.out.println("O Número pertence a sequencia de Fibonacci");
        } else {
            System.out.println("O Número não pertence a sequencia de Fibonacci");
        }

    }

}