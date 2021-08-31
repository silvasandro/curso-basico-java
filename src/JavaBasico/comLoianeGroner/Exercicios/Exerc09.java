package JavaBasico.comLoianeGroner.Exercicios;

/*
 * Faça um Programa que leia 3 números e mostre-os em ordem decrescente
 * */

import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número");
        double num1 = scan.nextDouble();

        System.out.println("Entre com o segundo número");
        double num2 = scan.nextDouble();

        System.out.println("Entre com o terceiro número");
        double num3 = scan.nextDouble();

        if (num1 <= num2 && num1 <= num3 && num2 <= num3){
                //num1 é menor
                //num3 é maior
                //nm 1 < num2 < num3
            System.out.println(num3 + " - " + num2 + " - " + num1);
        } else if (num1 <= num2 && num1 <= num3){
            //num1 é menor
            //num2 é maior
            //num 1 < num3 < num2
            System.out.println(num2 + " - " + num3 + " - " + num1);
        } else if (num2 <= num1 && num2 <= num3 && num1 <= num3){
            //num2 é menor
            //num3 é maior
            //num2 < num1 < num3
            System.out.println(num3 + " - " + num1 + " - " + num2);
        }
        if (num1 <= num2 && num1 <= num3 && num2 <= num3){
            //num1 é menor
            //num3 é maior
            //nm 1 < num2 < num3
            System.out.println(num3 + " - " + num2 + " - " + num1);
        } else if (num1 <= num2 && num1 <= num3){
            //num1 é menor
            //num2 é maior
            //num 1 < num3 < num2
            System.out.println(num2 + " - " + num1 + " - " + num3);
        } else if (num3 <= num1 && num3 <= num2 && num2 <= num1){
            //num3 é menor
            //num1 é maior
            //num3 < num2 < num1
            System.out.println(num1 + " - " + num2 + " - " + num3);
        }


    }
}
