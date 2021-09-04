package javaBasico.comLoianeGroner.Exercicios;

/*
*  Faça um Programa que peça um número inteiro
* e determine se o número é: par ou impar.
 * */
import java.util.Scanner;

public class Exerc18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = scan.nextInt();

        if(num % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }

    }
}
