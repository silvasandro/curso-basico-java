package JavaBasico.comLoianeGroner.Exercicios;

/*
* Faça um Programa que peça dois números e imprima o maior deles
* */

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o Primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o Segundo número: ");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println("O Número 1 é maior: " + num1);
        } else {
            System.out.println("O  Número 2 é maior: " + num1);
        }
    }
}
