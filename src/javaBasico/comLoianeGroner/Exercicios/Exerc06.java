package javaBasico.comLoianeGroner.Exercicios;

/*
 * Faça um Programa que leia 3 números e mostre o maior deles.
 * */

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número");
        int num2 = scan.nextInt();

        System.out.println("Entre com o terceiro número");
        int num3 = scan.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println("Número 1 é o maior: " + num1);
        }else if (num2 > num1 && num2 > num3) {
            System.out.println("Número 2 é o maior: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Número 3 é o maior: " + num3);
        }
    }
}
