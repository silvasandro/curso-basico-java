package JavaBasico.comLoianeGroner.Exercicios;

/*
* Faça um Programa que peça um valor e mostre na tela se o
* valor é posivito ou negativo
* */

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um  número");
        int num = scanner.nextInt();

        if (num >= 0) {
            System.out.println("O Número informado é positivo");
        } else {
            System.out.println("O Número informado é negativo");
        }


    }
}
