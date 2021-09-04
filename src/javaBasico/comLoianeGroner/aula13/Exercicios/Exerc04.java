package javaBasico.comLoianeGroner.aula13.Exercicios;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a Primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Entre com a Segunda nota:");
        double nota2 = scan.nextDouble();

        System.out.println("Entre com a Terceira nota:");
        double nota3 = scan.nextDouble();

        System.out.println("Entre com a Quarta nota:");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média é: " + media);



    }
}
