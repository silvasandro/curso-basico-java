package javaBasico.comLoianeGroner.Exercicios02;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("A Soma dos números entre: ");
        int num1 = scan.nextInt();

        System.out.println("Até: ");
        int num2 = scan.nextInt();

        int soma = 0;

        for(int i = num1; i <= num2; i++){
        soma += i;
        }
        System.out.println("É igual a: " + soma);
    }
}